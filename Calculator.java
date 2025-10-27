import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (System.console() == null) {
            // Non-interactive mode (like Jenkins)
            System.out.println("Running in Jenkins... using test values.");
            double a = 10, b = 20;
            char op = '+';
            double result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> b != 0 ? a / b : Double.NaN;
                default -> Double.NaN;
            };
            System.out.println("Result = " + result);
        } else {
            System.out.println("Simple Java Calculator");
            System.out.println("Supported operations: +, -, *, /");
            System.out.println("Enter 'exit' to quit");

            while (true) {
                System.out.print("Enter first number: ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) break;
                double num1 = Double.parseDouble(input);

                System.out.print("Enter operator: ");
                char op = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = switch (op) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num2 != 0 ? num1 / num2 : Double.NaN;
                    default -> Double.NaN;
                };

                System.out.println("Result = " + result);
            }
        }
    }
}
