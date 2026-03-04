extern int main(int argc, void** argv);
extern void sys_exit(int code);

/*
 * _start is the ELF entry point — jumped to by the kernel, NOT called.
 * At entry, RSP points to argc (System V x86-64 ABI initial process stack).
 * We pop argc into RDI and move the updated RSP (pointing at argv[0]) into
 * RSI before calling main(argc, argv), satisfying the SysV calling convention.
 * Passing argc/argv unconditionally is harmless — main bodies that declare no
 * parameters simply ignore the incoming registers.
 * Using naked avoids any compiler-generated prolog that would corrupt RSP.
 */
__attribute__((naked)) void _start()
{
    __asm__ volatile (
        "xor %rbp, %rbp\n\t"
        "pop %rdi\n\t"
        "mov %rsp, %rsi\n\t"
        "call main\n\t"
        "mov %eax, %edi\n\t"
        "call sys_exit\n\t"
        "ud2\n\t"
    );
}
