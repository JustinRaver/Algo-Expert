package Easy.BranchSums;

import java.util.ArrayList;
import java.util.List;

public class Solution {
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
        getBranchSum(root,list, 0);
        return list;
    }

    public static void getBranchSum(BinaryTree root, List<Integer> list, int sum){
        if(root.left == null && root.right == null){
            list.add(sum+root.value);
        }
        if(root.left != null){
            getBranchSum(root.left, list, sum+root.value);
        }
        if(root.right != null){
            getBranchSum(root.right, list, sum+root.value);
        }
    }
}
