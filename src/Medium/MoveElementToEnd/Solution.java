package Medium.MoveElementToEnd;

import java.util.List;

public class Solution {
    /*
     * You're given an array of integers and an integer. Write a function that moves all
     *  instances of that integer in the array to the end of the array and returns the
     * array.
     *
     * The function should perform this in place (i.e., it should mutate the input
     * array) and doesn't need to maintain the order of the other integers.
     */
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int end = array.size() - 1;
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) == toMove) {
                swap(array, i, end--);
            }
        }
        return array;
    }

    public static void swap(List<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

}
