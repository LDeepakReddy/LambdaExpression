package com.blz.lambdaexpression;

public class MathOperation {
    public static void main(String[] args) {

        IMathOperation addition = (a, b) -> a + b;
        IMathOperation subtraction = (a, b) -> a - b;
        IMathOperation multiplication = (a, b) -> a * b;
        IMathOperation division = (a, b) -> a / b;

        System.out.println(addition.calculate(7, 7));
        System.out.println(subtraction.calculate(5, 7));
        System.out.println(multiplication.calculate(7, 7));
        System.out.println(division.calculate(49, 8));

    }
}
