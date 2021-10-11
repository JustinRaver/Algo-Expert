package Easy.ClosestValueInBST;

public class Solution {
    /*
     * Write a function that takes in a Binary Search Tree and a target and returns the closest value
     * to that target value contained in the BST
     *
     * You can assume there will only be one closest value
     *
     * Each BST node has an integer (value), a left child node and a right child node. A node is said
     * to be a valid BST if and only if if satisfies the BST property: its value is stricly greater
     * than the values of every node to its left; its value is less than or equal to the values of
     * every node to its right; and its children nodes are either valid BST nodes themselves or null
     */
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        BST node = tree;
        int closest = tree.value;

        while (node != null) {
            if (Math.abs(node.value - target) < Math.abs(closest - target)) {
                closest = node.value;
            }
            if (node.value > target) {
                node = node.left;
            } else if (node.value < target) {
                node = node.right;
            } else {
                return node.value;
            }
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
