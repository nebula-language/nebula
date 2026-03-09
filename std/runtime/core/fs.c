#include <stdint.h>

// =============================================================================
// Forward declarations from platform layer
// =============================================================================

extern long sys_open(const char* path, int flags, int mode);
extern int  sys_close(int fd);
extern long sys_read(int fd, void* buf, long count);
extern long sys_write(int fd, const void* buf, long count);
extern long sys_lseek(int fd, long offset, int whence);
extern long sys_fstat_size(int fd);
extern long sys_stat_size(const char* path);

// Forward declaration from allocator
extern void* neb_alloc(uint64_t size);
extern void  neb_free(void* ptr);

// =============================================================================
// Nebula string type (must match runtime.c)
// =============================================================================

typedef struct
{
    const uint8_t* ptr;
    int64_t len;
} NebulaStr;

// =============================================================================
// Open mode constants  (Linux x86_64)
// =============================================================================

#define O_RDONLY    0
#define O_WRONLY    1
#define O_RDWR     2
#define O_CREAT    64
#define O_TRUNC    512
#define O_APPEND   1024

// lseek whence
#define SEEK_SET  0
#define SEEK_CUR  1
#define SEEK_END  2

// =============================================================================
// File open — returns fd (>= 0 on success, < 0 on error)
// =============================================================================

// Open for reading
int64_t __nebula_rt_fs_open_read(NebulaStr path)
{
    // We need a null-terminated copy for the syscall
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long fd = sys_open((const char*)cpath, O_RDONLY, 0);
    neb_free(cpath);
    return (int64_t)fd;
}

// Open for writing (create + truncate)
int64_t __nebula_rt_fs_open_write(NebulaStr path)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long fd = sys_open((const char*)cpath, O_WRONLY | O_CREAT | O_TRUNC, 0644);
    neb_free(cpath);
    return (int64_t)fd;
}

// Open for appending (create if not exists)
int64_t __nebula_rt_fs_open_append(NebulaStr path)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long fd = sys_open((const char*)cpath, O_WRONLY | O_CREAT | O_APPEND, 0644);
    neb_free(cpath);
    return (int64_t)fd;
}

// Open for read + write
int64_t __nebula_rt_fs_open_rw(NebulaStr path)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long fd = sys_open((const char*)cpath, O_RDWR | O_CREAT, 0644);
    neb_free(cpath);
    return (int64_t)fd;
}

// =============================================================================
// File close
// =============================================================================

int32_t __nebula_rt_fs_close(int64_t fd)
{
    return (int32_t)sys_close((int)fd);
}

// =============================================================================
// File read — reads up to `count` bytes into a pre-allocated buffer
// Returns number of bytes read, or < 0 on error
// =============================================================================

int64_t __nebula_rt_fs_read(int64_t fd, uint8_t* buf, int64_t count)
{
    return (int64_t)sys_read((int)fd, buf, (long)count);
}

// =============================================================================
// File write — writes `count` bytes from buffer to fd
// Returns number of bytes written, or < 0 on error
// =============================================================================

int64_t __nebula_rt_fs_write(int64_t fd, const uint8_t* buf, int64_t count)
{
    return (int64_t)sys_write((int)fd, buf, (long)count);
}

// =============================================================================
// File write string — convenience for writing a Nebula str
// =============================================================================

int64_t __nebula_rt_fs_write_str(int64_t fd, NebulaStr s)
{
    return (int64_t)sys_write((int)fd, s.ptr, (long)s.len);
}

// =============================================================================
// Seek
// =============================================================================

int64_t __nebula_rt_fs_seek(int64_t fd, int64_t offset, int32_t whence)
{
    return (int64_t)sys_lseek((int)fd, (long)offset, (int)whence);
}

// =============================================================================
// File size — via fstat on an open fd
// =============================================================================

int64_t __nebula_rt_fs_file_size(int64_t fd)
{
    return (int64_t)sys_fstat_size((int)fd);
}

// =============================================================================
// File size by path — via stat
// =============================================================================

int64_t __nebula_rt_fs_path_size(NebulaStr path)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long result = sys_stat_size((const char*)cpath);
    neb_free(cpath);
    return (int64_t)result;
}

// =============================================================================
// Read entire file into a Nebula str
// =============================================================================

NebulaStr __nebula_rt_fs_read_all(NebulaStr path)
{
    NebulaStr empty = { (const uint8_t*)"", 0 };

    // Null-terminate the path
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return empty;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    // Open for reading
    long fd = sys_open((const char*)cpath, O_RDONLY, 0);
    neb_free(cpath);
    if (fd < 0) return empty;

    // Get file size
    long size = sys_fstat_size((int)fd);
    if (size < 0)
    {
        sys_close((int)fd);
        return empty;
    }

    // Allocate buffer
    uint8_t* buf = (uint8_t*)neb_alloc((uint64_t)(size + 1));
    if (!buf)
    {
        sys_close((int)fd);
        return empty;
    }

    // Read entire file
    long total_read = 0;
    while (total_read < size)
    {
        long n = sys_read((int)fd, buf + total_read, size - total_read);
        if (n <= 0) break;
        total_read += n;
    }
    buf[total_read] = '\0';

    sys_close((int)fd);

    NebulaStr result = { buf, total_read };
    return result;
}

// =============================================================================
// Write entire string to file (create + truncate)
// =============================================================================

int64_t __nebula_rt_fs_write_all(NebulaStr path, NebulaStr content)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return -1;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long fd = sys_open((const char*)cpath, O_WRONLY | O_CREAT | O_TRUNC, 0644);
    neb_free(cpath);
    if (fd < 0) return (int64_t)fd;

    long written = sys_write((int)fd, content.ptr, (long)content.len);
    sys_close((int)fd);
    return (int64_t)written;
}

// =============================================================================
// Check if file exists (via stat)
// =============================================================================

int32_t __nebula_rt_fs_exists(NebulaStr path)
{
    uint8_t* cpath = (uint8_t*)neb_alloc((uint64_t)(path.len + 1));
    if (!cpath) return 0;
    for (int64_t i = 0; i < path.len; i++) cpath[i] = path.ptr[i];
    cpath[path.len] = '\0';

    long result = sys_stat_size((const char*)cpath);
    neb_free(cpath);
    return (result >= 0) ? 1 : 0;
}

// =============================================================================
// Read N bytes from an open fd into a new Nebula str
// =============================================================================

NebulaStr __nebula_rt_fs_read_str(int64_t fd, int64_t count)
{
    NebulaStr empty = { (const uint8_t*)"", 0 };
    if (count <= 0) return empty;

    uint8_t* buf = (uint8_t*)neb_alloc((uint64_t)(count + 1));
    if (!buf) return empty;

    long total_read = 0;
    while (total_read < count)
    {
        long n = sys_read((int)fd, buf + total_read, count - total_read);
        if (n <= 0) break;
        total_read += n;
    }
    buf[total_read] = '\0';

    NebulaStr result = { buf, total_read };
    return result;
}
