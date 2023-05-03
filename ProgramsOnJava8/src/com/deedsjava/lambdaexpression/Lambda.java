package com.deedsjava.lambdaexpression;

public class Lambda {

    interface FunctionalInterfaceExample{
        void singleAbstractMethod();
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample=
                ()-> System.out.println("Simple Example of Functional Interface ");

        functionalInterfaceExample.singleAbstractMethod();
    }
}
