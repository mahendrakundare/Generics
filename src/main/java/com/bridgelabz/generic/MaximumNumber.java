package com.bridgelabz.generic;

public class MaximumNumber {
    //generic method
    public static <E extends Comparable<E>> E toFindMax(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max)>0)
            max=b;
        if (c.compareTo(max)>0)
            max=c;
        return max;
    }
}
