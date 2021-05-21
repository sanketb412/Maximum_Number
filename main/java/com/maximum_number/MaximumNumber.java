package com.maximum_number;

public class MaximumNumber {
    public Integer maximumNUmber(Integer x, Integer y, Integer z) {
        Integer maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        return maximum;
    }

    public Float maximumFloatNUmber(Float x, Float y, Float z) {
        Float maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum of Three Variables");
    }
}
