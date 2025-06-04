package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 * Write a program that gets a number between 1 and 1,000,000
 * from the user and determines whether it is odd
 * or even using an if statement. Print the result.
 *
 * NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // 1. Create Scanner object (this line was missing/commented out in your last paste)
        Scanner scanner = new Scanner(System.in);

        // 2. Declare variables for input and validation flag
        int number = 0; // This variable will hold the validated input
        boolean isValid; // Flag to track if input is valid

        // 3. Start of the do-while loop for input validation
        do {
            isValid = true; // Assume input is valid at the start of each attempt

            // Prompt user for input (this prompt is now correctly inside the loop)
            System.out.print("Enter a number between 1 and 1,000,000: ");

            // Try-catch block to handle non-numeric input
            try {
                // Attempt to read an integer from the user and assign to 'number'
                number = scanner.nextInt();

                // Check if the number is within the valid range
                if (number < 1 || number > 1_000_000) {
                    System.out.println("Invalid number. Please enter a number between 1 and 1,000,000.");
                    isValid = false; // Mark input as invalid if out of range
                }
            } catch (java.util.InputMismatchException e) {
                // Catches the exception if the user enters non-numeric input
                System.out.println("Invalid input! Please enter a whole number.");
                isValid = false; // Mark input as invalid
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            }

        } while (!isValid); // Loop continues as long as isValid is false

        // --- Logic to determine if the valid number is Even or Odd ---

        // Check if the validated 'number' is even using the modulo operator (%)
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            // If not even, it must be odd
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close(); // Close the scanner to release system resources
    }
}