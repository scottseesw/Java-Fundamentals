package labs_examples.arrays.labs;


import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int[] numbers = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter integer number " + (i + 1) + " of 10: ");
            numbers[i] = scanner.nextInt();
        }


        int sum = 0;
        double average;


        for(int num : numbers) {
            sum += num;
        }


        average = (double)sum / numbers.length;


        System.out.println("The sum of the numbers is " + sum + " and the average of the numbers is " + average);


        scanner.close();

    }

}




