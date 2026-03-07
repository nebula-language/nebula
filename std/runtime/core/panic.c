extern long sys_write(int fd, const void* buf, long count);
extern void sys_exit(int code);

void neb_panic(const char* message) {
    // Very basic panic
    const char* prefix = "PANIC: ";
    int len = 0;
    while (message[len]) len++;

    sys_write(2, prefix, 7);
    sys_write(2, message, len);
    sys_write(2, "\n", 1);
    sys_exit(1);
}

/**
 * Panic handler for Nebula str values (ptr + len).
 * Called by the compiler on optional unwrap failure (!), unreachable match, etc.
 */
typedef struct { const char* ptr; long len; } neb_str_t;

void panic_msg(neb_str_t msg) {
    const char* prefix = "PANIC: ";
    sys_write(2, prefix, 7);
    if (msg.ptr && msg.len > 0) {
        sys_write(2, msg.ptr, msg.len);
    }
    sys_write(2, "\n", 1);
    sys_exit(1);
}
