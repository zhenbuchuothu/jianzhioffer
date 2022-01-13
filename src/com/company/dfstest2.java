package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树 深度搜索所有路径 非递归 栈实现
public class dfstest2 {
    public static void main(String[] args) {

    }

    List<String> binaryTreePaths (TreeNode root){
        // 用来放所有路径
        List<String> res = new ArrayList<>();

        if ( root == null)
            return res;
        Stack<Object> stack = new Stack();
        //存节点
        stack.push(root);
        //存路径
        stack.push(root.val+"");
        while(!stack.empty()){
            String path = (String) stack.pop();
            TreeNode node = (TreeNode) stack.pop();
            if (node.right == null && node.left == null) {
                res.add(path);


            }

            if (node.right != null) {
                stack.push(node.right);
                stack.push(path+"->"+ node.right.val);
            }
            if(node.left != null){
                stack.push(node.left);
                stack.push(path+"->"+ node.left.val);
            }

        }
        return res;
    }
}
