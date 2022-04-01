package com.blz.lambdaexpression;

public class MathOperation {
    public static void main(String[] args) {

        IMathOperation addition = (a, b) -> a + b;
        IMathOperation subtraction = (a, b) -> a - b;
        IMathOperation multiplication = (a, b) -> a * b;
        IMathOperation division = (a, b) -> a / b;

        IMathOperation.showResult(7, 7, "Addition", addition);
        IMathOperation.showResult(3, 5, "Subtraction", subtraction);
        IMathOperation.showResult(7, 7, "Multiplication", multiplication);
        IMathOperation.showResult(48, 8, "Division", division);

    }
}
