package Medium.ThreeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
     * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum
     * . The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of them. The numbers in each triplet should be ordered in ascending order, and the triplets
     * themselves should be ordered in ascending order with respect to the numbers they hold
     *
     * If no three numbers sum up to the target sum, the function should return an empty array
     */
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        // List to store triplets
        List<Integer[]> list = new ArrayList<>();
        // for each num in array up to array.length-2
        for (int i = 0; i < array.length - 2; i++) {
            int start = i + 1;
            int end = array.length - 1;

            while (start < end) {
                int startNum = array[start];
                int endNum = array[end];
                int currNum = array[i];
                int sum = startNum + endNum + currNum;

                if (sum < targetSum) {
                    start++;
                } else if (sum > targetSum) {
                    end--;
                } else {
                    list.add(new Integer[]{currNum, startNum, endNum});
                    start++;
                    end--;
                }
            }
        }
        return list;
    }

}
