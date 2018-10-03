package jianzhioffer.com.hiki.Offer27_38.Offer27;

import jianzhioffer.com.hiki.Offer16_26.Offer26.HasSubtree.TreeNode;
/*
    二叉树的镜像
    操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    private void swap(TreeNode root) {
        TreeNode t=root.left;
        root.left=root.right;
        root.right=t;
    }
}
