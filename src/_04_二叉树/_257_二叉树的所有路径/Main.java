package _04_二叉树._257_二叉树的所有路径;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("result = ");
//        binaryTreePaths();
    }


    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        binaryTree(root, "", paths);
        return paths;

    }

    private void binaryTree(TreeNode node, String path, List<String> paths) {
        if (node != null) {
            System.out.println(node.val);
            System.out.println(path);
            path = path + String.valueOf(node.val);
            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                path = path + "->";
                binaryTree(node.left, path, paths);
                binaryTree(node.right, path, paths);
            }
        }
    }

}
