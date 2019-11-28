package com.bridgelabz.generic;

public class ArrayExample<A, B, C> {
    A[] myArray;
    B[] myBArray;
    C[] myCArray;


    public ArrayExample(A[] myXArray, B[] myBArray, C[] myCArray) {
        this.myArray = myXArray;
        this.myBArray = myBArray;
        this.myCArray = myCArray;
    }

    public static void main(String[] args) {
        Integer integerArray[] = {1,2,3,4,5};
        Double doubleArray[] = {10.0,20.0, 30.5, 40.45, 50.44};
        Character charArray[]= {'a', 'b', 'c','d','e' };
        new ArrayExample<Integer ,Double, Character>(integerArray, doubleArray,charArray).toPrint();
    }

    private void toPrint() {
        toPrint(myArray);
        toPrint(myBArray);
        toPrint(myCArray);
    }

    private static <E> void toPrint(E[] allArray) {
        for (E i : allArray)
            System.out.println(i);
    }
}
