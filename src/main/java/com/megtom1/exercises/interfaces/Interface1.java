package com.megtom1.exercises.interfaces;

public interface Interface1 {

    String INTERFACE1_VALUE = "Value from Interface1.";
    String INTERFACE1_SPECIFIC_VALUE = "Value from Interface1.";

    default String getValue() {
        return INTERFACE1_VALUE;
    }

    default String getInterface1SpecificValue() {
        return INTERFACE1_SPECIFIC_VALUE;
    }
}
