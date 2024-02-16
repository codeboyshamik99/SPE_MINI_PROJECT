package org.example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Square root function (√x)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value of x: ");
                    double x1 = scanner.nextDouble();
                    System.out.println("Square root of " + x1 + " is: " + squareRoot(x1));
                    break;

                case 2:
                    System.out.print("Enter the value of x: ");
                    int x2 = scanner.nextInt();
                    System.out.println("Factorial of " + x2 + " is: " + factorial(x2));
                    break;

                case 3:
                    System.out.print("Enter the value of x: ");
                    double x3 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + x3 + " is: " + naturalLog(x3));
                    break;

                case 4:
                    System.out.print("Enter the value of x: ");
                    double x4 = scanner.nextDouble();
                    System.out.print("Enter the value of b: ");
                    double b = scanner.nextDouble();
                    System.out.println(x4 + " raised to the power " + b + " is: " + power(x4, b));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static int factorial(int x) {
        if (x == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}
