import java.util.*;

public class basicCalculator 
{
    public static double getValidNumber(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number:");
            }
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: +, -, *, / or type 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
            break;
            }

            System.out.println("Enter the first number:");
            double num1 = getValidNumber(scanner);

            System.out.println("Enter the second number:");
            double num2 = getValidNumber(scanner);

            switch (operation) {
                case "+":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }

    }

}
