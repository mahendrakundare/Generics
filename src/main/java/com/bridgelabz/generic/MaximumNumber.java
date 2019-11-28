package com.bridgelabz.generic;

public class MaximumNumber {

    public static Integer toFindMaxNumber() {
        Integer num1 = 200;
        Integer num2 = 50;
        Integer num3 = 1000;
        Integer max=num1;
        if (num2.compareTo(max)>0)
            max=num2;
        if (num3.compareTo(max)>0)
            max=num3;
        else
            max=num1;
        return max;
    }

    public static Float toFindMaxFloatNumber() {
        Float num1 = 10.6f;
        Float num2 = 35.8f;
        Float num3 = 5.5f;
        Float max = num1;
        if (num2.compareTo(max)>0)
            max=num2;
        else if (num3.compareTo(max)>0)
            max=num3;
        else
            max=num1;
        return max;
    }

    public static String toFindMaxString() {
        String name1 = "ironman";
        String name2 = "batman";
        String name3 = "superman";
        String maxString = name1;
        if (name2.compareTo(maxString)>0)
            maxString=name2;
        else if (name3.compareTo(maxString)>0)
            maxString=name3;
        else
            maxString=name1;
        return maxString;
    }
}
