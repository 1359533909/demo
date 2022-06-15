// Copyright (C) 2021 Meituan
// All rights reserved
package curse;

import com.example.demo.other.model.TreeNode;

/**
 * @author mxl
 * @version 1.0
 * 2021/12/19 下午7:36
 **/
class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        preTree(root);
    }

    private void preTree(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (prev != null){
            prev.left = null;
            prev.right = root;
        }
        prev = root;
        preTree(left);
        preTree(right);
    }
}
