#include <stdint.h>

// =============================================================================
// Linux file system syscalls — raw inline assembly, no libc
// =============================================================================

// syscall numbers (x86_64)
// open  = 2
// close = 3
// read  = 0
// write = 1
// lseek = 8
// fstat = 5
// stat  = 4

// open flags
// O_RDONLY  = 0
// O_WRONLY  = 1
// O_RDWR   = 2
// O_CREAT  = 64
// O_TRUNC  = 512
// O_APPEND = 1024

long sys_open(const char* path, int flags, int mode)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (2), "D" (path), "S" (flags), "d" (mode)
        : "rcx", "r11", "memory"
    );
    return ret;
}

int sys_close(int fd)
{
    int ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (3), "D" (fd)
        : "rcx", "r11", "memory"
    );
    return ret;
}

long sys_read(int fd, void* buf, long count)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (0), "D" (fd), "S" (buf), "d" (count)
        : "rcx", "r11", "memory"
    );
    return ret;
}

long sys_lseek(int fd, long offset, int whence)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (8), "D" (fd), "S" (offset), "d" (whence)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// Linux struct stat layout for x86_64 (partial — we only need st_size at offset 48)
// Total struct size is 144 bytes
long sys_fstat_size(int fd)
{
    uint8_t statbuf[144];
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (5), "D" (fd), "S" (statbuf)
        : "rcx", "r11", "memory"
    );
    if (ret < 0) return ret;
    // st_size is at offset 48 in the x86_64 stat struct
    return *(long*)(statbuf + 48);
}

long sys_stat_size(const char* path)
{
    uint8_t statbuf[144];
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (4), "D" (path), "S" (statbuf)
        : "rcx", "r11", "memory"
    );
    if (ret < 0) return ret;
    return *(long*)(statbuf + 48);
}
