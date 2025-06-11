package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][]  twoDArray = new int[5][5];
        int multOfThree = 3;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoDArray[i][j] = multOfThree;
                multOfThree += 3;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();

            }
        }

    }

