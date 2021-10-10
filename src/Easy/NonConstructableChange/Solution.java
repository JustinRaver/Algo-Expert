package Easy.NonConstructableChange;

import java.util.Arrays;

public class Solution {
    /*
     * Given an array of positive integers representing the value of coins in your possession
     * write a function that returns the minimum amount of change (the minimum sum of money)
     * that you cannot creat. The given coins can have any positive integer value and aren't
     * necessarily unique.
     *
     * For example, if you're given coins = [1, 2, 5], the minimum amount of change that you
     * can't create is 4. If your give nno coins, the minimum amount of change that you can't
     * create is 1.
     */

    public int nonConstructibleChange(int[] coins) {
        // sort the array
        Arrays.sort(coins);
        // if the array does not contain 1 return 1

        // the max amount of change we have made
        int maxChange = 0;

        for(int coin:coins){
            // if the current coin is greater than maxChange+1 we cannot create maxChange +1
            if(coin > maxChange+1){
                return maxChange+1;
            }
            maxChange += coin;
        }
        return maxChange+1;
    }

}
