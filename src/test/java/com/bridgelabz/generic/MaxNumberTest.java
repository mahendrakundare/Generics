package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void tofindMaximumNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result = maximumNumber.findMaxNumber();
        Assert.assertEquals((Integer) 200, result);
    }
}
