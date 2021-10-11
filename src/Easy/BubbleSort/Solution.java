package Easy.BubbleSort;

public class Solution {
    /*
     * Write a function that takes in an array of integers and returns a sorted version of that array. Use the Bubble
     *  Sort algorithm to sort the array.
     *
     */
    public static int[] bubbleSort(int[] array) {
        // [1,5,2,9,11,4]


        // way to track the state of the array
        boolean sorted = false;
        // count the number sorted elements
        int numSorted = 0;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1 - numSorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
            numSorted++;
        }
        return array;
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
