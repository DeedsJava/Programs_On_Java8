package com.deedsjava.lambdaexpression;

public class LambdaWithParameters {
    interface FunctionalInterfaceExample{
        void singleAbstractMethod(int x, int y);
    }
    public static void main(String[] args) {

        FunctionalInterfaceExample functionalInterfaceExample=(x, y) -> {
            int sum=x+y;
            System.out.println("Sum of given 2 numbers: " + sum);
        };

        functionalInterfaceExample.singleAbstractMethod(10, 20);
    }
}
