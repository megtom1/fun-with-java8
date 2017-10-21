package com.megtom1.exercises.java8;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test for new java8 foreach construction")
class ForEachExample {

    @Test
    @DisplayName("Print whole string list")
    void justPrintingOutWholeList() {
        List<String> someListWithStrings = Lists.newArrayList(
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphabetic(4));

        someListWithStrings.forEach(System.out::print);
    }

    @Test
    @DisplayName("Sum some values")
    void sumValuesFromList() {
        List<Integer> listWitValues = Lists.newArrayList(
                RandomUtils.nextInt(),
                RandomUtils.nextInt(),
                RandomUtils.nextInt(),
                RandomUtils.nextInt(),
                RandomUtils.nextInt());

        //each thread will have an instance of its own local variable here
        //therefore using Atomic* here is not needed
        AtomicLong sumOfValues = new AtomicLong(0L);
        listWitValues.forEach(sumOfValues::addAndGet);

        assertTrue(sumOfValues.get() > 0L);
    }
}