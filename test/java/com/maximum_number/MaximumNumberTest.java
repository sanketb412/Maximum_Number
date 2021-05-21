package com.maximum_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximum = new MaximumNumber();

    @Test
    public void given3NumberReturnFirstNumber() {
        Integer result = maximum.maximumNUmber(81,1,45);
        Assertions.assertEquals(81, result);
    }

}
