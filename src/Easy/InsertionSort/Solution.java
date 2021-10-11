package Easy.InsertionSort;

public class Solution {
    /*
     * Write a function that takes in an array of integers and returns a sorted version of that array. Use the
     * Insertion Sort algorithm to sort the array.
     */
    public static int[] insertionSort(int[] array) {
        // consider the first element of the list to be sorted
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int k = i - 1;
            while (k >= 0 && array[j] < array[k]) {
                swap(array, j, k);
                j--;
                k--;
            }
        }
        return array;
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
