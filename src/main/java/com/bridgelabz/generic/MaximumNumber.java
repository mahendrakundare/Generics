package com.bridgelabz.generic;

public class MaximumNumber {

    public static Integer findMaxNumber() {
        Integer num1 = 200;
        Integer num2 = 50;
        Integer num3 = 100;
        Integer max=num1;
        if (num2.compareTo(max)>0)
            max=num2;
        if (num3.compareTo(max)>0)
            max=num3;
        else
            max=num1;
        return max;
    }
}
