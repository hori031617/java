import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.TreeNode;

/**
 * 94.
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * 
 * Example 2:
 * Input: root = []
 * Output: []
 */
class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }

    

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        
        root.left = null;
        root.right = treeNode2;
        root.right.left = treeNode3;

        inorderTraversal(root);
    }
}
