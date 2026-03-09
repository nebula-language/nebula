#include <stdint.h>

// =============================================================================
// Linux process and directory syscalls — raw inline assembly, no libc
// =============================================================================
//
// Syscall numbers (x86_64 Linux):
//   fork      = 57
//   execve    = 59
//   wait4     = 61
//   mkdir     = 83
//   rmdir     = 84
//   unlink    = 87
//   getdents64= 217
//   chdir     = 80
//   getcwd    = 79

// =============================================================================
// sys_fork — clone the current process
// Returns: child PID in parent, 0 in child, <0 on error
// =============================================================================

long sys_fork(void)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (57)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_execve — execute a program
// Returns: does not return on success, <0 on error
// =============================================================================

long sys_execve(const char* path, const char* const argv[], const char* const envp[])
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (59), "D" (path), "S" (argv), "d" (envp)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_wait4 — wait for a child process to change state
// Returns: PID of terminated child, <0 on error
// =============================================================================

long sys_wait4(int pid, int* wstatus, int options, void* rusage)
{
    long ret;
    __asm__ volatile (
        "movq %4, %%r10\n\t"
        "syscall"
        : "=a" (ret)
        : "a" (61), "D" ((long)pid), "S" (wstatus), "d" ((long)options), "r" (rusage)
        : "rcx", "r11", "r10", "memory"
    );
    return ret;
}

// =============================================================================
// sys_mkdir — create a directory
// Returns: 0 on success, <0 on error
// =============================================================================

long sys_mkdir(const char* path, int mode)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (83), "D" (path), "S" ((long)mode)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_rmdir — remove an empty directory
// Returns: 0 on success, <0 on error
// =============================================================================

long sys_rmdir(const char* path)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (84), "D" (path)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_unlink — remove a file
// Returns: 0 on success, <0 on error
// =============================================================================

long sys_unlink(const char* path)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (87), "D" (path)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_getdents64 — get directory entries
// Returns: number of bytes read, 0 at end, <0 on error
// =============================================================================

long sys_getdents64(int fd, void* dirp, long count)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (217), "D" ((long)fd), "S" (dirp), "d" (count)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// sys_getcwd — get current working directory
// Returns: 0 on success, <0 on error
// =============================================================================

long sys_getcwd(char* buf, long size)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (79), "D" (buf), "S" (size)
        : "rcx", "r11", "memory"
    );
    return ret;
}
