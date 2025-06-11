package labs_examples.arrays.labs;
import java.util.Arrays;
/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {
        int[] nums = {10, 30, 25, 16, 8, 20};
        int tempVal;
        System.out.println("Original Array: "+ Arrays.toString(nums));
        for (int left = 0, right = nums.length - 1; left < right; left++, right -= 1) {
        tempVal = nums[left];
        nums[left] = nums[right];
        nums[right] = tempVal;

        }
        System.out.println("Reversed Array: " + Arrays.toString(nums));
    }
}











