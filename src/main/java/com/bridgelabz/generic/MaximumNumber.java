package com.bridgelabz.generic;

public class MaximumNumber<T extends Comparable > {

    T value1;
    T value2;
    T value3;
    T max;
    public MaximumNumber(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    //generic method
    public <T extends Comparable> T toFindMax(T value1, T value2, T value3) {
         T max = (T) this.value1;
        if (this.value2.compareTo(max)>0)
            max= (T) this.value2;
        if (this.value3.compareTo(max)>0)
            max= (T) this.value3;
        return max;
    }

    public <T> T toFindMax(){
        T maxElememt= (T) toFindMax(value1, value2, value3);
        printMax(maxElememt);
        return maxElememt;

    }

    private static <T> void printMax(T maximumValue){
        System.out.println(maximumValue);
    }
}
