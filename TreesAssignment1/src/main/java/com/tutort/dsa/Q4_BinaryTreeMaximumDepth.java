package com.tutort.dsa;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree 
 */
public class Q4_BinaryTreeMaximumDepth {
	int max = 0;
    public int maxDepth(TreeNode root) {
        findDepth(root , 1);
        return max;
    }
    
    void findDepth(TreeNode root , int level){
        if(root == null){
            return;
        }
        
        if(max < level){
            max = level;
        }
        
        findDepth(root.left , level +1);
        findDepth(root.right , level +1);
    }
}
