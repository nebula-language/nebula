#include <stdint.h>

// =============================================================================
// std::system — process and directory operations for the Nebula runtime
// =============================================================================
//
// Provides:
//   __nebula_rt_system_exec(cmd)       — fork + exec via /bin/sh -c
//   __nebula_rt_system_mkdir(path)     — create a single directory
//   __nebula_rt_system_mkdir_all(path) — create directory and all parents
//   __nebula_rt_system_rm_all(path)    — recursively remove a directory tree
//   __nebula_rt_system_getcwd()        — get current working directory as str

// =============================================================================
// Forward declarations
// =============================================================================

// Platform syscalls
extern long sys_fork(void);
extern long sys_execve(const char* path, const char* const argv[], const char* const envp[]);
extern long sys_wait4(int pid, int* wstatus, int options, void* rusage);
extern long sys_mkdir(const char* path, int mode);
extern long sys_rmdir(const char* path);
extern long sys_unlink(const char* path);
extern long sys_getdents64(int fd, void* dirp, long count);
extern long sys_getcwd(char* buf, long size);

// FS syscalls (from linux_fs_syscalls.c)
extern long sys_open(const char* path, int flags, int mode);
extern int  sys_close(int fd);

// Allocator (from allocator.c)
extern void* neb_alloc(uint64_t size);
extern void  neb_free(void* ptr);

// =============================================================================
// Internal types
// =============================================================================

typedef struct
{
    const uint8_t* ptr;
    int64_t len;
} NebulaStr;

// linux_dirent64 layout — used by getdents64
typedef struct
{
    uint64_t d_ino;
    int64_t  d_off;
    uint16_t d_reclen;
    uint8_t  d_type;
    char     d_name[1]; // variable length, name starts here
} LinuxDirent64;

// =============================================================================
// Internal helpers
// =============================================================================

static int64_t neb_system_strlen(const char* s)
{
    int64_t n = 0;
    while (s[n] != '\0') n++;
    return n;
}

// Copy a NebulaStr to a null-terminated C string on the heap.
// Caller is responsible for calling neb_free on the result.
static char* neb_str_to_cstr(NebulaStr s)
{
    char* buf = (char*)neb_alloc((uint64_t)(s.len + 1));
    if (!buf) return (char*)0;
    for (int64_t i = 0; i < s.len; i++) buf[i] = (char)s.ptr[i];
    buf[s.len] = '\0';
    return buf;
}

// Concatenate two C strings into a newly allocated buffer.
static char* neb_cstr_concat(const char* a, const char* b)
{
    int64_t la = neb_system_strlen(a);
    int64_t lb = neb_system_strlen(b);
    char* buf = (char*)neb_alloc((uint64_t)(la + lb + 1));
    if (!buf) return (char*)0;
    for (int64_t i = 0; i < la; i++) buf[i]      = a[i];
    for (int64_t i = 0; i < lb; i++) buf[la + i]  = b[i];
    buf[la + lb] = '\0';
    return buf;
}

// Create a NebulaStr from a heap-allocated C string, taking ownership of ptr.
static NebulaStr neb_cstr_to_str(char* cstr, int64_t len)
{
    return (NebulaStr){ (const uint8_t*)cstr, len };
}

// =============================================================================
// __nebula_rt_system_exec
// =============================================================================
//
// Execute a shell command synchronously via /bin/sh -c <cmd>.
// Returns the exit status of the child process, or -1 on fork failure.

int32_t __nebula_rt_system_exec(NebulaStr cmd)
{
    char* cstr = neb_str_to_cstr(cmd);
    if (!cstr) return -1;

    long pid = sys_fork();

    if (pid < 0)
    {
        // fork failed
        neb_free(cstr);
        return -1;
    }

    if (pid == 0)
    {
        // ── child process ─────────────────────────────────────────────────
        const char* argv[4];
        argv[0] = "/bin/sh";
        argv[1] = "-c";
        argv[2] = cstr;
        argv[3] = (const char*)0;

        const char* envp[1];
        envp[0] = (const char*)0;

        sys_execve("/bin/sh", argv, envp);

        // If execve returns we have an error — exit with code 127
        // (same convention as shells for "command not found")
        __asm__ volatile (
            "movl $60, %%eax\n\t"   // syscall: exit
            "movl $127, %%edi\n\t"
            "syscall\n\t"
            ::: "eax", "edi", "memory"
        );
        __builtin_unreachable();
    }

    // ── parent process ────────────────────────────────────────────────────
    neb_free(cstr);

    int wstatus = 0;
    sys_wait4((int)pid, &wstatus, 0, (void*)0);

    // WEXITSTATUS: (wstatus >> 8) & 0xff
    if ((wstatus & 0x7f) == 0)
    {
        return (wstatus >> 8) & 0xff;
    }

    return -1;
}

// =============================================================================
// __nebula_rt_system_mkdir
// =============================================================================
//
// Create a single directory.  Returns 0 on success, <0 on error.

int32_t __nebula_rt_system_mkdir(NebulaStr path)
{
    char* cpath = neb_str_to_cstr(path);
    if (!cpath) return -1;

    long ret = sys_mkdir(cpath, 0755);
    neb_free(cpath);

    return (int32_t)ret;
}

// =============================================================================
// __nebula_rt_system_mkdir_all
// =============================================================================
//
// Create a directory and all missing parent directories (like mkdir -p).
// Returns 0 on success, <0 on error.

int32_t __nebula_rt_system_mkdir_all(NebulaStr path)
{
    if (path.len == 0) return -1;

    char* cpath = neb_str_to_cstr(path);
    if (!cpath) return -1;

    // Walk the path and create each component
    char* tmp = (char*)neb_alloc((uint64_t)(path.len + 1));
    if (!tmp)
    {
        neb_free(cpath);
        return -1;
    }

    int64_t len = path.len;
    int32_t result = 0;

    for (int64_t i = 0; i <= len; i++)
    {
        if (i == len || cpath[i] == '/')
        {
            // Null-terminate at this component
            for (int64_t k = 0; k < i; k++) tmp[k] = cpath[k];
            tmp[i] = '\0';

            if (i > 0 && tmp[i - 1] != '/')
            {
                long r = sys_mkdir(tmp, 0755);
                // -17 is EEXIST on Linux — already exists, not an error
                if (r < 0 && r != -17)
                {
                    result = (int32_t)r;
                    break;
                }
            }
        }
    }

    neb_free(tmp);
    neb_free(cpath);
    return result;
}

// =============================================================================
// __nebula_rt_system_rm_all  (internal recursive helper)
// =============================================================================

#define GETDENTS_BUF_SIZE 4096

// Open flags (must match linux_fs_syscalls.c)
#define O_RDONLY    0

// d_type constants
#define DT_DIR  4
#define DT_REG  8

static int32_t neb_rm_all_cstr(const char* path);

static int32_t neb_rm_all_cstr(const char* path)
{
    // Try to unlink first (file case)
    long ret = sys_unlink(path);
    if (ret == 0) return 0;

    // -21 = EISDIR — it's a directory; descend into it
    long fd = sys_open(path, O_RDONLY, 0);
    if (fd < 0) return (int32_t)fd;

    uint8_t buf[GETDENTS_BUF_SIZE];
    int32_t result = 0;

    while (1)
    {
        long nread = sys_getdents64((int)fd, buf, GETDENTS_BUF_SIZE);
        if (nread <= 0) break;

        long bpos = 0;
        while (bpos < nread)
        {
            LinuxDirent64* d = (LinuxDirent64*)(buf + bpos);
            bpos += d->d_reclen;

            // Skip . and ..
            char* name = d->d_name;
            if (name[0] == '.' && (name[1] == '\0' || (name[1] == '.' && name[2] == '\0')))
            {
                continue;
            }

            // Build child path: path + "/" + name
            char* child = neb_cstr_concat(path, "/");
            if (!child) { result = -1; continue; }
            char* full  = neb_cstr_concat(child, name);
            neb_free(child);
            if (!full) { result = -1; continue; }

            int32_t r = neb_rm_all_cstr(full);
            neb_free(full);

            if (r != 0) result = r;
        }
    }

    sys_close((int)fd);

    // Remove the (now empty) directory itself
    long rr = sys_rmdir(path);
    if (rr != 0 && result == 0) result = (int32_t)rr;

    return result;
}

// Public entry point — accepts NebulaStr
int32_t __nebula_rt_system_rm_all(NebulaStr path)
{
    char* cpath = neb_str_to_cstr(path);
    if (!cpath) return -1;

    int32_t result = neb_rm_all_cstr(cpath);
    neb_free(cpath);
    return result;
}

// =============================================================================
// __nebula_rt_system_getcwd
// =============================================================================
//
// Return the current working directory as a Nebula str.
// Returns an empty str on failure.

NebulaStr __nebula_rt_system_getcwd(void)
{
    // Use a 4096-byte buffer (PATH_MAX on Linux)
    char* buf = (char*)neb_alloc(4096);
    if (!buf) return (NebulaStr){ (const uint8_t*)"", 0 };

    long ret = sys_getcwd(buf, 4096);
    if (ret < 0)
    {
        neb_free(buf);
        return (NebulaStr){ (const uint8_t*)"", 0 };
    }

    int64_t len = neb_system_strlen(buf);
    return neb_cstr_to_str(buf, len);
}
