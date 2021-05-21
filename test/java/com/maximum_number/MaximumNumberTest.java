package com.maximum_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximum = new MaximumNumber();

    /**
     * Getting Maximum for Integer Values
     */
    @Test
    public void given3NumberReturnFirstNumber() {
        Integer result = maximum.maximumNUmber(81,1,45);
        Assertions.assertEquals(81, result);
    }

    @Test
    public void given3NumberReturnSecondNumberMax() {
        Integer result = maximum.maximumNUmber(2,4,1);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void given3NumberReturnThirdNumberMax() {
        Integer result = maximum.maximumNUmber(45,40,99);
        Assertions.assertEquals(99,result);
    }

    /**
     * Getting maximum number from Floating value
     */
    @Test
    public void given3NumberReturnFirstNumberMax() {
        Float result = maximum.maximumFloatNUmber(99.3f,40.6f,0.3f);
        Assertions.assertEquals(99.3f,result);
    }

    @Test
    public void given3NumberReturnSecondFloatNumberMax() {
        Float result = maximum.maximumFloatNUmber(9.3f,99.3f,0.3f);
        Assertions.assertEquals(99.3f,result);
    }

    @Test
    public void given3NumberReturnThirdFloatNumberMax() {
        Float result = maximum.maximumFloatNUmber(0.3f,40.6f,99.3f);
        Assertions.assertEquals(99.3f,result);
    }
}
