package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1;
        double operand2;
        double operation;
        double answer = 0;

        System.out.println("Enter first operand: ");
        Scanner scnr = new Scanner(System.in);
        operand1 = scnr.nextDouble(); //user enters first operand

        System.out.println("Enter second operand: ");
        operand2 = scnr.nextDouble(); //user enters second operand

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Which operation do you want to perform? ");

        operation = scnr.nextDouble(); //user selects the operation they wish to perform

        if (operation == 1) { answer = operand1 + operand2;
            System.out.println("The result of the operation is " + answer + ". Goodbye!");}
        if (operation == 2) { answer = operand1 - operand2;
            System.out.println("The result of the operation is " + answer + ". Goodbye!");}
        if (operation == 3) { answer = operand1 * operand2;
            System.out.println("The result of the operation is " + answer + ". Goodbye!");}
        if (operation == 4) { answer = operand1 / operand2;
            System.out.println("The result of the operation is " + answer + ". Goodbye!");}

        if (operation < 1) { System.out.print("Error: Invalid selection! Terminating program."); }
        if (operation > 4) { System.out.print("Error: Invalid selection! Terminating program."); }

    }
}
