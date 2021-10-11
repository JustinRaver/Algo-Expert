package Easy.BinarySearch;

public class Solution {
    /*
     * Write a function that takes in a sorted array of integers as well as a target integer. The function should use
     *  the Binary Search Algorithm ot determine if that target integer is contained in the array and should return
     * its index if it is otherwise -1.
     *
     * If you're unfamiliar with Binary Search, we recommend watching teh conceptual overview section of thi questions
     *  video explanation before starting to code.
     */
    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;


        while (start <= end) {
            int mid = end - start / 2;
            int midNum = array[mid];
            if (midNum == target) {
                return mid;
            } else if (midNum < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
