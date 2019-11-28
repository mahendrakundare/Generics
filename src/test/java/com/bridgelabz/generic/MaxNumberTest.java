package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void toTestMaximumAfterCreatingGeneric() {
        MaximumNumber<Integer> integerMaximumNumber = new MaximumNumber<Integer>(10, 20, 30);
        Comparable comparable = integerMaximumNumber.toFindMax();
        Assert.assertEquals(30,comparable);
    }

    @Test
    public void toTestMaximumByPassingFloatsToConstructor() {
        MaximumNumber<Float> floatMaximumNumber = new MaximumNumber<Float>(10.6f, 35.8f, 5.5f);
        Comparable comparable = floatMaximumNumber.toFindMax();
        Assert.assertEquals(35.8f,comparable);
    }

    @Test
    public void toTestMaximumByPassingStringToConstructor() {
        MaximumNumber<String> stringMaximum = new MaximumNumber<String>("ironman", "batman", "superman");
        Comparable comparable = stringMaximum.toFindMax();
        Assert.assertEquals("superman",comparable);
    }

    @Test
    public void when_Entered_Should_Return_Maximum_With_PrintMax() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<Integer>(10, 20, 30);
        Object maximum=maximumNumber.toFindMax();
        Assert.assertEquals((Integer)30,maximum);
    }
}
