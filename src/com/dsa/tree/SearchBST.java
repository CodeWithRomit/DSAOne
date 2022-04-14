package com.dsa.tree;

/*
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = null;
        if (root.val == val) {
            result = root;
        }
        if (result == null && null != root.left) {
            result = searchBST(root.left, val);
        }
        if (result == null && null != root.right) {
            result = searchBST(root.right, val);
        }
        return result;
    }
}