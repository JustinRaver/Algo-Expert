package Easy.GetNthFibonacci;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*
     * The Fibonacci sequence is defined as follows: the first number of the sequence is 0, the second number is 1,
     * and the nth number is the sum of the n-1 th and n-2th numbers. Write a function that takes in an integer n and
     *  returns the nth Fibonacci number.
     *
     * Important note: the Fibonacci sequence is often defined with its first two numbers as F0=0 and F1=1. For the
     * purpose of this question, the first Fibonacci number is F0; therefore, getNthFib(1) is equal to F0, getNthFib
     * (2)
     */

    public static int getNthFib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return getFib(n, map);
    }

    public static int getFib(int n, Map<Integer, Integer> map) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (!map.containsKey(n - 1)) {
            map.put(n - 1, getFib(n - 1, map));
        }
        if (!map.containsKey(n - 2)) {
            map.put(n - 2, getFib(n - 2, map));
        }
        return map.get(n - 1) + map.get(n - 2);
    }

}
