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

    @Test
    public void toTestMaximumByPassingNumberUsingOption() {
        MaximumUsingOption<Integer> maximumUsingOption = new MaximumUsingOption<Integer>(10, 20, 30, 500, 70);
        Assert.assertEquals((Integer)500,maximumUsingOption.check());
    }

    @Test
    public void toTestMaximumNumberOnPositionOneShouldReturnPositionOneValue() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(500, 10, 30);
        Assert.assertEquals((Integer)500,maximumNumber.toFindMax());
    }

    @Test
    public void toTestMaximumNumberOnPositoinTwoShouldReturnPositionTwoValue() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<Integer>(10, 35, 2);
        Assert.assertEquals((Integer)35,maximumNumber.toFindMax());
    }

    @Test
    public void toTestMaximumNumberOnPositionThreeShouldReturnPositionThreeValue() {
        MaximumNumber<Integer> maximumNumber = new MaximumNumber<Integer>(20, 500, 1000);
        Assert.assertEquals((Integer)1000,maximumNumber.toFindMax());
    }
}
