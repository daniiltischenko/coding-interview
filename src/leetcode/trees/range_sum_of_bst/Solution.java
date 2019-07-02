package leetcode.trees.range_sum_of_bst;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public int rangeSumBST(TreeNode root, int L, int R) {
    return meth(root, L, R);
  }

  int meth(TreeNode root, int L, int R) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return root.val > L && root.val <= R ? root.val : 0;
    }

    TreeNode next = root.left != null ? root.left : root.right;

    return meth(next, L, R);
  }

}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}