package com.elakkiya.Polymorphism;

public class MethodOverloading {
    int largest;
    int largestNumber(int a, int b)
    {
        largest = a > b ? a : b;
        return largest;
    }

    int largestNumber(int a, int b, int c) {
        int temp = Math.max(a, b);
        largest = Math.max(temp, c);
        return largest;
    }
    public static void main(String[] args) {

        MethodOverloading value = new MethodOverloading();
        System.out.println("Largest of two number   " + value.largestNumber(5, 7));
        System.out.println("Largest of three number   " + value.largestNumber(7, 9, 2));
         }
}
