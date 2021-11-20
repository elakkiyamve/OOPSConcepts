package com.elakkiya.Polymorphism;

public class Parent {

    void StringConcat() {
        int sum;
        int a = 6;
        int b = 9;
        sum = a+b;
        System.out.println(sum);
    }


    public static void main(String[] args) {
        Child child = new Child();

        child.StringConcat();

    }
}