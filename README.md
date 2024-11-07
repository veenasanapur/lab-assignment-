import java.util.Scanner;

public class RemainderCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter integer A: ");
        int A = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int B = scanner.nextInt();

        // Check if B is zero to avoid division by zero error
        if (B == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Calculate the remainder using modulus operator
            int remainder = A % B;

            // Display the result
            System.out.println("The remainder when " + A + " is divided by " + B + " is: " + remainder);
        }

        // Close the scanner
        scanner.close();
    }
