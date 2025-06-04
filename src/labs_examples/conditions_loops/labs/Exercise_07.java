package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();
        String vowels = "aeiou";
        int index = 0;
        char firstVowel = ' ';
        boolean vowelFound = false;

        while (index < word.length() && !vowelFound) {
            char currentChar = Character.toLowerCase(word.charAt(index));
            if (vowels.indexOf(currentChar) != -1) {
                firstVowel = currentChar;
                vowelFound = true;

            }
            index++;

        }
        if (vowelFound) {
            System.out.println("The word is " + word + " and the first vowel is " + firstVowel);
        } else {
            System.out.println("No vowel found in the " + word);


        }
        scanner.close();
    }

}