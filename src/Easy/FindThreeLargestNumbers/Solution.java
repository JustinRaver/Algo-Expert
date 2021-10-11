package Easy.FindThreeLargestNumbers;

public class Solution {
    /*
     * Write a function that takes in a n array of atleast three integers and, without sorting the input array,
     * returns a sorted array of the three largest integers int the input array.
     *
     * The function should return duplicate integers if necessary; ofr example, it should return [10, 10, 12] for an
     * input array of [10, 5, 9, 10 ,12].
     */
    public static int[] findThreeLargestNumbers(int[] array) {

        //for each number
        // first check if it is greater than the min value
        // if greater check if greater than mid val min val == mid val
        // if greater than max val mid val == max val max val = num
        int minVal = Integer.MIN_VALUE;
        int midVal = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > minVal) {
                if (i > midVal) {
                    if (i > maxVal) {
                        minVal = midVal;
                        midVal = maxVal;
                        maxVal = i;
                        continue;
                    }
                    minVal = midVal;
                    midVal = i;
                    continue;
                }
                minVal = i;
            }
        }
        return new int[]{minVal, midVal, maxVal};
    }
}
