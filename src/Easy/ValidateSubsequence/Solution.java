package Easy.ValidateSubsequence;

import java.util.List;

public class Solution {
    /*
     * Given two non-empty arrays of integers, write a function that determines whether the
     * second array is a subsequence of the first one.
     *
     * A subsequence of an array is a set of numbers that aren't necessarily adjacent in the
     * array but that are in the same aorder as they appear in the array. For instance, the
     * numbers [1, 3, 4] for the subsequence of the array [1, 2, 3, 4], and so do the numbers
     * [2, 4]. Not that a single number in an array itself are both valid subsequences of the
     * array.
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int idx = 0;
        for (Integer i : array) {
            if (idx == sequence.size()) break;
            if (sequence.get(idx).equals(i)) idx++;
        }
        return idx == sequence.size();
    }
}
