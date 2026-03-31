#include <stdint.h>
#include <stddef.h>
#include <math.h>

/* Forward declarations of allocator and memory functions */
extern void* neb_alloc(size_t size);
extern void* memcpy(void* dest, const void* src, size_t n);

/* Nebula string fat-pointer type */
typedef struct
{
    const uint8_t* ptr;
    int64_t        len;
} NebulaStr;

/* Forward declaration used by neb_str_split */
NebulaStr neb_str_substring(NebulaStr s, int64_t start, int64_t len);

/* =========================================================================
 * std::Ptr::from — wraps a Nebula value pointer for FFI boundary crossing
 * ========================================================================= */
void* std__Ptr__from(void* value)
{
    return value;
}

/* =========================================================================
 * FFI test stubs — no-ops used by the proof file
 * ========================================================================= */
void rt_resource_release(void* r) { (void)r; }
void rt_resource_inspect(void* r) { (void)r; }
void rt_resource_unknown(void* r) { (void)r; }
void c_print_user(void* u)       { (void)u; }
void c_consume_user(void* u)     { (void)u; }
void c_unknown(void* u)          { (void)u; }

/* =========================================================================
 * std::collections::HashMap patch stubs
 * ========================================================================= */
int64_t std__collections__HashMap__bucketIndex(void* self)
{
    (void)self;
    return 0;
}

/* =========================================================================
 * neb_str_split — split a Nebula str by a separator string
 *
 * Returns a heap-allocated array of NebulaStr values (count written to
 * *count_out).  Each element is a substring slice sharing the original
 * buffer's pointer (no extra allocation).  The array itself is allocated
 * via neb_alloc.
 * ========================================================================= */
NebulaStr* neb_str_split(NebulaStr s, NebulaStr sep, int64_t* count_out)
{
    if (count_out == (void*)0)
    {
        /* Should never happen, but be safe */
        static NebulaStr empty_arr[1];
        empty_arr[0] = s;
        return empty_arr;
    }

    /* Count occurrences of the separator to size the result array */
    int64_t sep_len = sep.len;
    int64_t s_len   = s.len;

    /* If separator is empty, return the original string as a single element */
    if (sep_len == 0)
    {
        *count_out = 1;
        NebulaStr* result = (NebulaStr*)neb_alloc(sizeof(NebulaStr));
        result[0] = s;
        return result;
    }

    /* First pass: count splits */
    int64_t count = 1;
    for (int64_t i = 0; i <= s_len - sep_len; )
    {
        /* Check if sep matches at position i */
        int match = 1;
        for (int64_t k = 0; k < sep_len; k++)
        {
            if (s.ptr[i + k] != sep.ptr[k])
            {
                match = 0;
                break;
            }
        }
        if (match)
        {
            count++;
            i += sep_len;
        }
        else
        {
            i++;
        }
    }

    /* Allocate result array */
    NebulaStr* result = (NebulaStr*)neb_alloc((size_t)(count * (int64_t)sizeof(NebulaStr)));
    int64_t part = 0;
    int64_t start = 0;

    /* Second pass: fill in part strings */
    for (int64_t i = 0; i <= s_len - sep_len; )
    {
        int match = 1;
        for (int64_t k = 0; k < sep_len; k++)
        {
            if (s.ptr[i + k] != sep.ptr[k])
            {
                match = 0;
                break;
            }
        }
        if (match)
        {
            result[part++] = neb_str_substring(s, start, i - start);
            start = i + sep_len;
            i += sep_len;
        }
        else
        {
            i++;
        }
    }
    /* Final fragment */
    result[part++] = neb_str_substring(s, start, s_len - start);

    *count_out = count;
    return result;
}

/* =========================================================================
 * neb_array_sort_i32 — in-place ascending sort for i32 arrays
 * ========================================================================= */
void neb_array_sort_i32(int32_t* data, int64_t len)
{
    if (data == (void*)0 || len <= 1)
        return;

    /* Insertion sort: stable and simple for the modest array sizes in proofs. */
    for (int64_t i = 1; i < len; i++)
    {
        int32_t key = data[i];
        int64_t j = i - 1;
        while (j >= 0 && data[j] > key)
        {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = key;
    }
}

/* =========================================================================
 * neb_array_contains helpers
 * ========================================================================= */
int32_t neb_array_contains_i32(const int32_t* data, int64_t len, int32_t needle)
{
    if (data == (void*)0 || len <= 0)
        return 0;
    for (int64_t i = 0; i < len; i++)
    {
        if (data[i] == needle)
            return 1;
    }
    return 0;
}

int32_t neb_array_contains_str(const NebulaStr* data, int64_t len, NebulaStr needle)
{
    if (data == (void*)0 || len <= 0)
        return 0;

    for (int64_t i = 0; i < len; i++)
    {
        NebulaStr cur = data[i];
        if (cur.len != needle.len)
            continue;

        int equal = 1;
        for (int64_t j = 0; j < needle.len; j++)
        {
            if (cur.ptr[j] != needle.ptr[j])
            {
                equal = 0;
                break;
            }
        }
        if (equal)
            return 1;
    }
    return 0;
}

/* =========================================================================
 * std::math runtime helpers
 * ========================================================================= */
double __nebula_rt_math_sqrt(double x)
{
    return sqrt(x);
}

double __nebula_rt_math_abs(double x)
{
    return fabs(x);
}

double __nebula_rt_math_pow(double base, double exp)
{
    return pow(base, exp);
}

double __nebula_rt_math_floor(double x)
{
    return floor(x);
}

double __nebula_rt_math_ceil(double x)
{
    return ceil(x);
}

double __nebula_rt_math_log(double x)
{
    return log(x);
}

double __nebula_rt_math_min(double a, double b)
{
    return a < b ? a : b;
}

double __nebula_rt_math_max(double a, double b)
{
    return a > b ? a : b;
}
