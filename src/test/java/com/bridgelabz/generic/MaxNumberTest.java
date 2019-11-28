package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void toTestMaximumNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result = maximumNumber.toFindMaxNumber();
        Assert.assertEquals((Integer) 1000, result);
    }

    @Test
    public void toTestMaximumFloatNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float result = maximumNumber.toFindMaxFloatNumber();
        Assert.assertEquals((Float)35.8f,result);
    }
}
