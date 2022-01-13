package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树深度搜索所有路径 递归实现
public class dfstest {

    public static void main(String[] args) {
//        System.out.println(4>>2);

    }

    List<String> binaryTreePath(TreeNode<String> root){
        List<String> res = new ArrayList<>();
        dfs(root,res,"");
        return res;
    }
    private void dfs(TreeNode<String> root, List<String> res,String path ) {
        if (root == null)
            return;
        if(root.left==null && root.right==null){
            res.add(path+root.val);
        }
        dfs(root.left,res,path+root.val+"->");
        dfs(root.right,res,path+root.val+"->");
    }
}
class TreeNode<N> {

    N val;
    TreeNode left;
    TreeNode right;

    public TreeNode(N val){
        this.val = val;
    }
}


