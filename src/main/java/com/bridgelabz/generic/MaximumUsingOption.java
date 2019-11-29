package com.bridgelabz.generic;

import java.util.Arrays;

public class MaximumUsingOption<T extends Comparable> {
    T[] myArray;
    public MaximumUsingOption(T... val) {
        System.out.println();
        T[] array = (T[]) new Comparable[val.length];
        int i = 0;
        for (T c : val) {
            array[i] = c;
            i++;
        }
        this.myArray = array;
    }

    public T check() {
        Arrays.sort(myArray);
        return myArray[myArray.length - 1];
    }
}