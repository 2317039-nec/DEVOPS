import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Java Calculator");
        System.out.println("Supported operations: +, -, *, /");
        System.out.println("Enter 'exit' to quit");

        while (true) {
            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'exit'.");
                    continue;
                }
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            String operation = scanner.next();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Supported: +, -, *, /");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}
