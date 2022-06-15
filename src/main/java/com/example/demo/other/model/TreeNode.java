// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.model;

/**
 * @author mxl
 * @version 1.0
 * 2021/7/29 上午7:49
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

}
