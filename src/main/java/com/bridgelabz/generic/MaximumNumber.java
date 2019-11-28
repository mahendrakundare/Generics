package com.bridgelabz.generic;

public class MaximumNumber<T extends Comparable > {

    T value1;
    T value2;
    T value3;

    public MaximumNumber(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    //generic method
    public <T extends Comparable> T toFindMax() {
        T max = (T) value1;
        if (value2.compareTo(max)>0)
            max= (T) value2;
        if (value3.compareTo(max)>0)
            max= (T) value3;
        return max;
    }
}
