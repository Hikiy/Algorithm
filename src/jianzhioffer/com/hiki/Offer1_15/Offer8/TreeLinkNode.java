package jianzhioffer.com.hiki.Offer1_15.Offer8;
/*
    中序遍历中二叉树的下一个结点
    树结点有左右结点指针和父节点指针
    步骤：
        1.分析是否有右子树，有则找右子树的最左结点，没有最左则下个结点为右子树
        2.没有右子树，找父节点，如果父节点的左结点是本次结点，则下一个结点
            为父节点，如果不是父节点的左结点，则继续往上找父节点。
 */

public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode parent = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
    public static TreeLinkNode getNext(TreeLinkNode pNode){
        if(pNode.right!=null){
            TreeLinkNode node=pNode.right;
            while(node.left!=null){
                node=node.left;
            }
            return node;
        }
        else{
            while (pNode!=null){
                TreeLinkNode parent=pNode.parent;
                if(parent.left==pNode){
                    return parent;
                }
                else{
                    pNode=parent;
                }
            }
            return null;
        }
    }
}
