This repository (Nebula) is the single project for all parts of the Nebula language. nebc/ is the compiler, written in Java. std/ is the standard library, written in Nebula itself, it has std/runtime/ which adds the minimum necessary to be able to compile natively into all platform (current development only targets linux for faster development) without libc dependency so the Nebula language is completely agnostic from the platform. 

Write modular, production-grade, escalable code, prioritizing well estructured solutions rather than quick hacky fixes / features. E.g.: structure repeating patterns / code into helper methods.

Use the Allman style for all languages, e.g.: Java, Nebula, etc.

Every time, before coding, read thoroughly these files ./cvt.md (Which defines the Nebula language core philosophy and paradigm) and ./spec/revised/full.neb which is a example of all of the Nebula language features, both semantically and syntactically. So you completely understand Neubla's intended direction and scope.

When recompiling the nebc compiler, ensure you're in the correct path ./nebula/nebc/:
  - For testing / verifying / iterating you can simply do `mvn compile` (as its faster) and then simply execute it with Java.
  - The way to get the native image is with `mvn package`. That does generate a native binary at nebc/target/nebc. That's symlinked to `/usr/local/bin/nebc` so it'll be automatically updated in the path.

To compile the standard library (std/) with nebc, use these flags:
`nebc --library std/ -o neb --nostdlib` or the appropiate respective `java ...` command if testing with the .jar image.
--nostdlib is essential to ensure that it doesnt try to link with itself, which will cause redefinition errors.

Finally, acknowledge that your gonna be using fish, so you have to live up to its quirks, mainly syntactical differences from regular sh / bash and the use of $status instead of $0. If needed use /bin/bash everytime, e.g.: prepending every command with it