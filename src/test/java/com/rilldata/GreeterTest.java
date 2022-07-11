package com.rilldata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests
 */
public class GreeterTest {
    /**
     * Rigorous Test
     */
    @Test
    public void shouldGreet() {
        assertEquals("Hello Benjamin!", Greeter.greetInternal("Benjamin"));
    }
}
