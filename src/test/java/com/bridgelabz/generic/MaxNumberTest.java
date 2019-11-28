package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void toTestMaximumNumber() {

        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result = maximumNumber.toFindMax(1,2,3);
        Assert.assertEquals((Integer) 3, result);
    }

    @Test
    public void toTestMaximumFloatNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float result = maximumNumber.toFindMax(10.6f,35.8f,5.5f);
        Assert.assertEquals((Float)35.8f,result);
    }

    @Test
    public void toTestMaximumString(){
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.toFindMax("ironman","batman","superman");
        Assert.assertEquals("superman",result);
    }
}
