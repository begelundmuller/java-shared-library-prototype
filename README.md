# Native library from Java code

Quick experiment to setup GraalVM to build a native library from Java code:

Run:

```
mvn package -Pnative
```

On Mac, the shared library and headers are output to `target/`
