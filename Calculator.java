public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== Simple Java Calculator ===");

        // Sample data (since Jenkins can't take interactive input)
        double num1 = 10;
        double num2 = 5;
        char operator = '+';
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 != 0 ? num1 / num2 : Double.NaN;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Operation: " + num1 + " " + operator + " " + num2);
        System.out.println("Result: " + result);
        System.out.println("=== Calculation complete! ===");
    }
}
