package com.rilldata;

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;
import org.graalvm.nativeimage.c.type.CCharPointer;
import org.graalvm.nativeimage.c.type.CTypeConversion;

/**
 * Shared library
 */
public class Greeter {

    @CEntryPoint(name = "greet")
    public static CCharPointer greet(IsolateThread isolateThread, CCharPointer name) {
        String tmp = CTypeConversion.toJavaString(name);
        String result = greetInternal(tmp);
        CTypeConversion.CCharPointerHolder pointerHolder = CTypeConversion.toCString(result);
        return pointerHolder.get();
    }

    protected static String greetInternal(String name) {
        return "Hello " + name + "!";
    }

}
