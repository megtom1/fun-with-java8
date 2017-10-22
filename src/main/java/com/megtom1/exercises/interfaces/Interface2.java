package com.megtom1.exercises.interfaces;

public interface Interface2 {

    String INTERFACE2_VALUE = "Value from Interface2.";
    String INTERFACE2_SPECIFIC_VALUE = "Value from Interface2.";

    default String getValue() {
        return INTERFACE2_VALUE;
    }

    default String getInterface2SpecificValue() {
        return INTERFACE2_SPECIFIC_VALUE;
    }
}

