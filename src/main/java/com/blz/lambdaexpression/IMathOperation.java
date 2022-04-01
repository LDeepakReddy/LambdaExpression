package com.blz.lambdaexpression;

@FunctionalInterface

public interface IMathOperation {
    int calculate(int a, int b);

     static void showResult(int a,int b, String methodName, IMathOperation method){
         System.out.println("Result of " +methodName+ " is " +method.calculate(a, b));

     }

}

