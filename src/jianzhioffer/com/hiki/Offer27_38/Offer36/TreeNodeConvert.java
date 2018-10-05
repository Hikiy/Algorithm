package jianzhioffer.com.hiki.Offer27_38.Offer36;

import jianzhioffer.com.hiki.TreeNode;
/*
     二叉搜索树与双向链表
     输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     要求不能创建任何新的结点，只能调整树中结点指针的指向。
     （left指向前一个结点，right指向后一个结点）
     思路：
        中间的结点左连左子树中最大结点，右连右子树最小结点
        代码真的看了很久才理解，因为书上的思路说的很简单，但是指针操作真的有点晃
        1.使用中序遍历，这样刚好是从左到右顺序排序
        2.主要用到了自己新建的pre结点，来表示上一个判断好的结点。
        3.本次判断的结点，left连上一个结点，上一个结点right连本次结点
 */
public class TreeNodeConvert {
    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }
    private void inOrder(TreeNode node) {
        if(node==null)
            return;
        inOrder(node.left);
        node.left=pre;
        if(head==null)
            head=node;
        if(pre!=null)
            pre.right=node;
        pre=node;
        inOrder(node.right);
    }
}
