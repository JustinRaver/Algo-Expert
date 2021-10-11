package Easy.BranchSums;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
     * Write a function that takes in a Binary Tree and returns a list of its branch sums
     * ordered from the leftmost branch sum to a rightmost branch sum.
     *
     * A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree Branch
     * is a path of nodes in a tree that starts at the root node and ends at any leafy node.
     *
     * Each BinaryTree node has an integer value, a left child node, and a right child node.
     * Children nodes can either be a BinaryTree nodes themselves or None/Null.
     */
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        getBranchSum(root, list, 0);
        return list;
    }

    public static void getBranchSum(BinaryTree root, List<Integer> list, int sum) {
        if (root.left == null && root.right == null) {
            list.add(sum + root.value);
        }
        if (root.left != null) {
            getBranchSum(root.left, list, sum + root.value);
        }
        if (root.right != null) {
            getBranchSum(root.right, list, sum + root.value);
        }
    }
}
