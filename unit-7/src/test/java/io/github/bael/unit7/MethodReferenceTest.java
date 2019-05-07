package io.github.bael.unit7;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class MethodReferenceTest {
    @Test
    public void testString() {
        Function<String, String> trim = String::trim;

        // compose -> before, andThen -> after
        //
        String str = trim.compose((String o) -> o.replace("A", "Y"))
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(" ABCDEFG ");

        // " ABCDEFG " -> replace -> trim -> to lowercase -> sb new -> reverse -> tostring

        assertEquals("gfedcby", str);
    }
}