package Medium.SmallestDifference;

import java.util.Arrays;

public class Solution {
    /*
     * Write a function that takes in two non-empty arrays of integers, finds the pair
     * of numbers (one from each array) whose absolute difference in closest to zero,
     * and returns an array containing these two numbers, with the number from the
     * first array in the first position.
     *
     * Note that the absolute difference of two integers is the distance between the on
     *  the real number line. For example, the absolute difference of -5 and 5 is 10
     * and the difference of -5 and -4 is 1.
     *
     * You can assume that there will only be one pair of numbers with the smallest
     * difference.
     */
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int diff = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0, j = 0; i < arrayOne.length && j < arrayTwo.length; ) {
            int a1 = arrayOne[i];
            int a2 = arrayTwo[j];
            int currDiff = Math.abs(a1 - a2);

            if (currDiff < diff) {
                diff = currDiff;
                num1 = a1;
                num2 = a2;
            }

            if (a1 < a2) {
                i++;
            } else if (a2 < a1) {
                j++;
            } else {
                return new int[]{a1, a2};
            }
        }
        return new int[]{num1, num2};
    }
}
