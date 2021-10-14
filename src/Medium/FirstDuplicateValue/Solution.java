package Medium.FirstDuplicateValue;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /*
     * Given an array of integers between 1 and n, inclusive, where n is the length of the
     * array, write a function that returns the first integer that appears more that once
     * (when the array is read from left to right).
     *
     * In other words, out of all the integers that might occur more than once in the
     * input array, your function should return the one whose first duplicate value has the
     * minimum index.
     *
     * If no integer appears more than once, your function should return -1.
     */
    public int firstDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<>();

        for(int i:array){
            if(!set.add(i)){
                return i;
            }
        }
        return -1;
    }
}
