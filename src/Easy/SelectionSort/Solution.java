package Easy.SelectionSort;

public class Solution {
    /*
     * Write a function that takes in an array of integers and returns a sorted version of that array. Use the
     * selection Sort algorithm to sort the array.
     */
    public static int[] selectionSort(int[] array) {
        // each time find the smallest number and put it at the beginning of the array
        int swapIndex = 0;

        while (swapIndex <= array.length - 1) {
            int minValue = swapIndex;
            for (int i = swapIndex; i < array.length; i++) {
                if (array[minValue] > array[i]) {
                    minValue = i;
                }
            }
            swap(array, minValue, swapIndex++);
        }
        return array;
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
