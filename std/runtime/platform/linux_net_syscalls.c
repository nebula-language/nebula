#include <stdint.h>

// =============================================================================
// Linux x86-64 networking syscall numbers
// =============================================================================
#define SYS_close           3
#define SYS_poll            7
#define SYS_socket         41
#define SYS_connect        42
#define SYS_accept         43
#define SYS_sendto         44
#define SYS_recvfrom       45
#define SYS_shutdown       48
#define SYS_bind           49
#define SYS_listen         50
#define SYS_setsockopt     54
#define SYS_getsockopt     55
#define SYS_fcntl          72
#define SYS_epoll_wait    232
#define SYS_epoll_ctl     233
#define SYS_accept4       288
#define SYS_epoll_create1 291

// =============================================================================
// Inline assembly helpers — one per argument count
// =============================================================================

static inline long _sc2(long n, long a, long b)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (n), "D" (a), "S" (b)
        : "rcx", "r11", "memory"
    );
    return ret;
}

static inline long _sc3(long n, long a, long b, long c)
{
    long ret;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (n), "D" (a), "S" (b), "d" (c)
        : "rcx", "r11", "memory"
    );
    return ret;
}

static inline long _sc4(long n, long a, long b, long c, long d)
{
    long ret;
    register long r10 __asm__("r10") = d;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (n), "D" (a), "S" (b), "d" (c), "r" (r10)
        : "rcx", "r11", "memory"
    );
    return ret;
}

static inline long _sc5(long n, long a, long b, long c, long d, long e)
{
    long ret;
    register long r10 __asm__("r10") = d;
    register long r8  __asm__("r8")  = e;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (n), "D" (a), "S" (b), "d" (c), "r" (r10), "r" (r8)
        : "rcx", "r11", "memory"
    );
    return ret;
}

static inline long _sc6(long n, long a, long b, long c, long d, long e, long f)
{
    long ret;
    register long r10 __asm__("r10") = d;
    register long r8  __asm__("r8")  = e;
    register long r9  __asm__("r9")  = f;
    __asm__ volatile (
        "syscall"
        : "=a" (ret)
        : "a" (n), "D" (a), "S" (b), "d" (c), "r" (r10), "r" (r8), "r" (r9)
        : "rcx", "r11", "memory"
    );
    return ret;
}

// =============================================================================
// Socket lifecycle
// =============================================================================

long sys_net_socket(int domain, int type, int protocol)
{
    return _sc3(SYS_socket, (long)domain, (long)type, (long)protocol);
}

long sys_net_bind(int fd, const void* addr, unsigned int addrlen)
{
    return _sc3(SYS_bind, (long)fd, (long)(uintptr_t)addr, (long)addrlen);
}

long sys_net_listen(int fd, int backlog)
{
    return _sc2(SYS_listen, (long)fd, (long)backlog);
}

long sys_net_accept(int fd, void* addr, unsigned int* addrlen)
{
    return _sc3(SYS_accept, (long)fd, (long)(uintptr_t)addr, (long)(uintptr_t)addrlen);
}

long sys_net_accept4(int fd, void* addr, unsigned int* addrlen, int flags)
{
    return _sc4(SYS_accept4,
                (long)fd,
                (long)(uintptr_t)addr,
                (long)(uintptr_t)addrlen,
                (long)flags);
}

long sys_net_connect(int fd, const void* addr, unsigned int addrlen)
{
    return _sc3(SYS_connect, (long)fd, (long)(uintptr_t)addr, (long)addrlen);
}

long sys_net_shutdown(int fd, int how)
{
    return _sc2(SYS_shutdown, (long)fd, (long)how);
}

long sys_net_close(int fd)
{
    return _sc2(SYS_close, (long)fd, 0);
}

// =============================================================================
// Data transfer
// =============================================================================

long sys_net_sendto(int fd, const void* buf, long count,
                    int flags, const void* addr, unsigned int addrlen)
{
    return _sc6(SYS_sendto,
                (long)fd,
                (long)(uintptr_t)buf,
                count,
                (long)flags,
                (long)(uintptr_t)addr,
                (long)addrlen);
}

long sys_net_recvfrom(int fd, void* buf, long count,
                      int flags, void* addr, unsigned int* addrlen)
{
    return _sc6(SYS_recvfrom,
                (long)fd,
                (long)(uintptr_t)buf,
                count,
                (long)flags,
                (long)(uintptr_t)addr,
                (long)(uintptr_t)addrlen);
}

// =============================================================================
// Socket options
// =============================================================================

long sys_net_setsockopt(int fd, int level, int optname,
                        const void* optval, unsigned int optlen)
{
    return _sc5(SYS_setsockopt,
                (long)fd, (long)level, (long)optname,
                (long)(uintptr_t)optval, (long)optlen);
}

long sys_net_getsockopt(int fd, int level, int optname,
                        void* optval, unsigned int* optlen)
{
    return _sc5(SYS_getsockopt,
                (long)fd, (long)level, (long)optname,
                (long)(uintptr_t)optval, (long)(uintptr_t)optlen);
}

// =============================================================================
// File-control (O_NONBLOCK)
// =============================================================================

long sys_net_fcntl(int fd, int cmd, long arg)
{
    return _sc3(SYS_fcntl, (long)fd, (long)cmd, arg);
}

// =============================================================================
// Polling — level-triggered (poll) and edge-triggered (epoll)
// =============================================================================

long sys_net_poll(void* fds, unsigned int nfds, int timeout)
{
    return _sc3(SYS_poll, (long)(uintptr_t)fds, (long)nfds, (long)timeout);
}

long sys_net_epoll_create1(int flags)
{
    return _sc2(SYS_epoll_create1, (long)flags, 0);
}

long sys_net_epoll_ctl(int epfd, int op, int fd, void* event)
{
    return _sc4(SYS_epoll_ctl,
                (long)epfd, (long)op, (long)fd,
                (long)(uintptr_t)event);
}

long sys_net_epoll_wait(int epfd, void* events, int maxevents, int timeout)
{
    return _sc4(SYS_epoll_wait,
                (long)epfd,
                (long)(uintptr_t)events,
                (long)maxevents,
                (long)timeout);
}
