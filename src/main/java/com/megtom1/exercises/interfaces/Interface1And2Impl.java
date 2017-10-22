package com.megtom1.exercises.interfaces;

public class Interface1And2Impl implements Interface1, Interface2 {

    public static final String IMPLEMENTATION_CLASS_VALUE = "Value from implementation class.";

    @Override
    public String getValue() {
        //this method must be implemented in this class, otherwise there will be an error
        return IMPLEMENTATION_CLASS_VALUE;
    }
}
