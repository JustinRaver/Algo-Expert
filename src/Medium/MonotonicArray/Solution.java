package Medium.MonotonicArray;

public class Solution {
    /*
     * Write a function that takes in an array of inteers and returns a boolean representing
     *  whether the array is monotonic.
     *
     * An array is said to be monotonic if its elements, front left to right, are entirely
     * non-increasing or entirely non-decreasing
     *
     * Non-increasing elements aren't necessarily exclusively decreasing; they simply don't
     * increase. Similarly, non-decreasing elements arent necessarily exclusively
     * increasing; they simply don't decrease.
     */
    public static boolean isMonotonic(int[] array) {
        if(array.length <= 1){
            return true;
        }

        boolean in_de_crease = array[0] < array[array.length-1]?true:false;

        int prev = array[0];
        for(int i:array){
            if(in_de_crease){
                if(i < prev){
                    return false;
                }
            }else{
                if(i > prev){
                    return false;
                }
            }
            prev = i;
        }
        return true;
    }
}
