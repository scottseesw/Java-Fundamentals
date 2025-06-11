package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[5];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];

        jaggedArray[0][0] = 5;
        jaggedArray[0][1] = 10;
        jaggedArray[0][2] = 15;
        jaggedArray[0][3] = 20;
        jaggedArray[0][4] = 25;

        jaggedArray[1][0] = 6;
        jaggedArray[1][1] = 5;

        jaggedArray[2][0] = 5;
        jaggedArray[2][1] = 10;
        jaggedArray[2][2] = 11;
        jaggedArray[2][3] = 12;

        for (int[] itemsInArray : jaggedArray) {
            for (int element : itemsInArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}