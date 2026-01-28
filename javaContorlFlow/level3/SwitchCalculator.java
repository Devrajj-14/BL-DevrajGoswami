package javaControlFlow.level3;

import java.util.Scanner;

/*
 * Program: Calculator using switch-case
 * Input: first number, operator (+ - * /), second number
 * Output: result or invalid operator
 */
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Switch for operator selection
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                // Avoid divide by zero crash
                if (second == 0) System.out.println("Cannot divide by zero");
                else System.out.println("Result = " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
