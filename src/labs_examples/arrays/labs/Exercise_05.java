package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {


    /**
     * Traversing Arrays Backwards
     *
     * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
     * element in the array in reverse order.
     *
     */
        public static void main(String[] args) {
            int[] myArray = {12, 5, 20, 3, 25, 15};

            System.out.println("Printing every other element in reverse order:");


            for (int i = 5; i >= 0; i -= 2) {
                System.out.print(myArray[i] + " ");
            }
            System.out.println();

        }

    }

