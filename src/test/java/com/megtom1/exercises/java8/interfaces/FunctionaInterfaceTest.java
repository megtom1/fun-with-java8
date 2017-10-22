package com.megtom1.exercises.java8.interfaces;

import com.megtom1.exercises.interfaces.FunctionalInterfaceExample;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class FunctionaInterfaceTest {

    @Test
    void creatingAFunctionalInterface() {
        FunctionalInterfaceExample functionalInterfaceExample = String::toUpperCase;

        String afterConvert = functionalInterfaceExample.convert("abc");

        assertTrue(afterConvert.matches("[A-Z]+"));
    }
}
