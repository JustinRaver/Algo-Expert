package Easy.SortedSquaredArray;

import java.util.Arrays;

public class Solution {
    /*
     * Write a function that takes in non-empty array of integers
     * that are sorted in ascending order and returns a new array
     * of the same length with the squares of the original integers
     * also sorted in ascending order.
     */
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for(int i=0; i<array.length;i++){
            array[i] = array[i]*array[i];
        }
        Arrays.sort(array);
        return array;
    }
}
