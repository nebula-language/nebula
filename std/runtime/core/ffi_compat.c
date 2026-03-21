#include <stdint.h>
#include <stddef.h>

// =============================================================================
// ABI compatibility wrappers for std/*.neb extern declarations
// =============================================================================
//
// The Nebula std modules currently reference a small legacy FFI surface
// (neb_memset, neb_net_accept, neb_net_resolve, ...).  The runtime core uses
// newer internal names.  These wrappers keep exported symbols stable without
// changing std-facing Nebula code.

typedef struct
{
    const uint8_t* ptr;
    int64_t        len;
} NebulaStr;

extern void*    neb_alloc(size_t size);
extern void*    memset(void* s, int c, size_t n);
extern uint16_t neb_htons(uint16_t x);
extern uint32_t neb_ntohl(uint32_t x);
extern uint32_t neb_inet_aton(NebulaStr ip_str);

extern int32_t  neb_net_accept_fd(int32_t fd);
extern int32_t  neb_net_setsockopt(int32_t fd, int32_t level, int32_t optname,
                                   const void* optval, int32_t optlen);
extern NebulaStr neb_net_recv_all(int32_t fd, int64_t max_size);
extern uint32_t neb_net_dns_resolve(NebulaStr hostname);

extern long sys_net_accept4(int fd, void* addr, unsigned int* addrlen, int flags);

/* Resize a heap allocation. Simple bump-allocator: allocate fresh copy, copy data. */
void* neb_realloc(void* ptr, int64_t new_size)
{
    void* fresh = neb_alloc((size_t)new_size);
    if (fresh && ptr)
    {
        /* Copy as many bytes as fit in new_size from old allocation.
         * In a bump allocator we don't track old sizes; copy conservatively. */
        const uint8_t* src = (const uint8_t*)ptr;
        uint8_t*       dst = (uint8_t*)fresh;
        for (int64_t i = 0; i < new_size; i++)
            dst[i] = src[i];
    }
    return fresh;
}

/* Store a pointer-sized value at slot `index` in a pointer array at `base`. */
void neb_ptr_store(void* base, int64_t index, void* value)
{
    void** arr = (void**)base;
    arr[index] = value;
}

/* Load a pointer-sized value from slot `index` in a pointer array at `base`. */
void* neb_ptr_load(void* base, int64_t index)
{
    void** arr = (void**)base;
    return arr[index];
}

void neb_memset(void* ptr, int32_t val, int64_t bytes)
{
    if (bytes <= 0)
    {
        return;
    }
    memset(ptr, val, (size_t)bytes);
}

int64_t neb_sizeof_ptr(void)
{
    return (int64_t)sizeof(void*);
}

int32_t neb_net_htons(int32_t port)
{
    return (int32_t)neb_htons((uint16_t)port);
}

uint32_t neb_net_inet_addr(NebulaStr ip)
{
    return neb_inet_aton(ip);
}

int64_t neb_net_accept(int64_t fd)
{
    return (int64_t)neb_net_accept_fd((int32_t)fd);
}

int64_t neb_net_accept4(int64_t fd, int32_t flags)
{
    return (int64_t)sys_net_accept4((int32_t)fd, (void*)0, (unsigned int*)0, flags);
}

int32_t neb_net_setsockopt_i32(int64_t fd, int32_t level, int32_t optname, int32_t value)
{
    return neb_net_setsockopt((int32_t)fd, level, optname, &value, (int32_t)sizeof(value));
}

NebulaStr neb_net_recv_str(int64_t fd, int64_t maxLen)
{
    return neb_net_recv_all((int32_t)fd, maxLen);
}

static int append_u8_dec(char* out, int pos, uint8_t v)
{
    if (v >= 100)
    {
        out[pos++] = (char)('0' + (v / 100));
        v = (uint8_t)(v % 100);
        out[pos++] = (char)('0' + (v / 10));
        out[pos++] = (char)('0' + (v % 10));
        return pos;
    }
    if (v >= 10)
    {
        out[pos++] = (char)('0' + (v / 10));
        out[pos++] = (char)('0' + (v % 10));
        return pos;
    }
    out[pos++] = (char)('0' + v);
    return pos;
}

NebulaStr neb_net_resolve(NebulaStr hostname)
{
    uint32_t ip_net = neb_net_dns_resolve(hostname);
    if (ip_net == 0)
    {
        return (NebulaStr){ (const uint8_t*)"", 0 };
    }

    uint32_t ip_host = neb_ntohl(ip_net);
    uint8_t a = (uint8_t)((ip_host >> 24) & 0xFFu);
    uint8_t b = (uint8_t)((ip_host >> 16) & 0xFFu);
    uint8_t c = (uint8_t)((ip_host >> 8)  & 0xFFu);
    uint8_t d = (uint8_t)( ip_host        & 0xFFu);

    char* buf = (char*)neb_alloc(16); // "255.255.255.255\0"
    if (!buf)
    {
        return (NebulaStr){ (const uint8_t*)"", 0 };
    }

    int pos = 0;
    pos = append_u8_dec(buf, pos, a);
    buf[pos++] = '.';
    pos = append_u8_dec(buf, pos, b);
    buf[pos++] = '.';
    pos = append_u8_dec(buf, pos, c);
    buf[pos++] = '.';
    pos = append_u8_dec(buf, pos, d);
    buf[pos] = '\0';

    return (NebulaStr){ (const uint8_t*)buf, (int64_t)pos };
}

// -----------------------------------------------------------------------------
// Weak fallback stubs for executable attribute registry hooks.
//
// Executables compiled by nebc define strong versions of these symbols.  When
// absent (e.g. library-only linking), these fallbacks keep linkage valid and
// simply expose an empty attribute registry.
// -----------------------------------------------------------------------------

__attribute__((weak)) int64_t __nebula_rt_attr_entry_count(void)
{
    return 0;
}

__attribute__((weak)) NebulaStr __nebula_rt_attr_symbol_name(int64_t idx)
{
    (void)idx;
    return (NebulaStr){ (const uint8_t*)"", 0 };
}

__attribute__((weak)) int32_t __nebula_rt_attr_symbol_kind(int64_t idx)
{
    (void)idx;
    return 0;
}

__attribute__((weak)) NebulaStr __nebula_rt_attr_path(int64_t idx)
{
    (void)idx;
    return (NebulaStr){ (const uint8_t*)"", 0 };
}

__attribute__((weak)) int32_t __nebula_rt_attr_args_count(int64_t idx)
{
    (void)idx;
    return 0;
}

__attribute__((weak)) NebulaStr __nebula_rt_attr_arg(int64_t idx, int32_t arg_i)
{
    (void)idx;
    (void)arg_i;
    return (NebulaStr){ (const uint8_t*)"", 0 };
}

__attribute__((weak)) void* __nebula_rt_attr_fn_ptr(int64_t idx)
{
    (void)idx;
    return (void*)0;
}
