package com.megtom1.exercises.java8.interfaces;

import com.megtom1.exercises.interfaces.Interface1;
import com.megtom1.exercises.interfaces.Interface1And2Impl;
import com.megtom1.exercises.interfaces.Interface2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing default values in interfaces")
class DefaultValuesTest {

    @Test
    void test() {
        Interface1And2Impl clazz = new Interface1And2Impl();

        assertAll(
                () -> assertTrue(Interface1And2Impl.IMPLEMENTATION_CLASS_VALUE.equals(clazz.getValue())),
                () -> assertTrue(Interface1.INTERFACE1_SPECIFIC_VALUE.equals(clazz.getInterface1SpecificValue())),
                () -> assertTrue(Interface2.INTERFACE2_SPECIFIC_VALUE.equals(clazz.getInterface2SpecificValue()))
        );

    }

}
