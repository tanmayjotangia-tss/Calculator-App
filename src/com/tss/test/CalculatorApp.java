package com.tss.test;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator app");

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multipication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Enter first number");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number");
        double number2 = scanner.nextDouble();

        double addResult=addition.add(double a, double b);

        double subResult=subtraction.sub(double a, doubleb);

        double multipleResult=multiplication.multiply(double a, double b);

        double divisionResult=division.divide(double a, double b);

        System.out.println("Addition Result:" + addResult);
        System.out.println("Subtration Result:" + subResult);
        System.out.println("Multiplication Result:" + multipleResult);
        System.out.println("Division Result:" + divisionResult);




    }
}
