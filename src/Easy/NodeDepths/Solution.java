package Easy.NodeDepths;

public class Solution {
    /*
     * The distance a node in a Binary Tree and the tree's root is called the
     * nodes depth.
     *
     * Write a function that takes in a Binary Tree and returns a sum of
     * its node's depths.
     *
     * Each BinaryTree node has an integer value, a left child node, and a
     * right child node. Children nodes can either be BinaryTree node or
     * null.
     */
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return getNodeDepthSum(root,0);
    }

    public static int getNodeDepthSum(BinaryTree root, int level){
        if(root == null){
            return 0;
        }
        return level + getNodeDepthSum(root.left,level+1) + getNodeDepthSum(root.right, level+1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
