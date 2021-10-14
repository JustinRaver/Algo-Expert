package Medium.ArrayOfProducts;

import java.util.Arrays;

public class Solution {
    /*
     * Write a function that takes in a non-empty array of integers and returns an array of
     * the same length, where each element in the output array is equal to the product of
     * every other number in the array
     *
     * In other words, the value at output[i] is equal to the product of every number in the
     *  input array other than input[i].
     *
     * Note you're expected to solve this problem without division
     */
    public int[] arrayOfProducts(int[] array) {
        // naive approach goes to each index and multiplies the other indexes to get result
        int[] left = new int[array.length];
        int[] right = new int[array.length];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        int product = 1;
        for (int i = 0; i < left.length; i++) {
            left[i] = product;
            product *= array[i];
        }
        product = 1;
        for (int i = right.length - 1; i >= 0; i--) {
            right[i] = product;
            product *= array[i];

            left[i] *= right[i];
        }
        return left;
    }
}
