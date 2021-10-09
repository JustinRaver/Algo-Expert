package Easy.TwoNumberSum;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /*
     * Write a function that takes in a non-empty array of distinct integers
     * and an integer representing a target sum. If any two numbers in the
     * input array sum up to the target sum, the function should return them
     * in an array, in any order. If no two numbers sum up to hte target sum,
     * the function should return an empty array.
     */

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();

        for (int num : array){
            int match = targetSum - num;
            if (set.contains(match)) {
                return new int[] {match, num};
            } else {
                set.add(num);
            }
        }

        return new int[0];
    }
}
