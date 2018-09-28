package jianzhioffer.com.hiki.Offer1_15.Offer7;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;
/*
    重建二叉树
    根据前序遍历和中序遍历，重建二叉树
    步骤：
        1.将中序遍历存进hashmap中（为了可以快速得到下标）
        2.以前序遍历的第一个数为根节点。
        3.在hashmap中找这个根节点的下标，该下标往前为左子树，往右是右子树
            得出左右子树分别有多大，则前序遍历中，根节点后前多少位就为左子树，
            后多少位就为右子树，再分别以第一位为父节点，递归查找左右子树
 */
public class TreeUtil {
    private static Map<Integer,Integer> indexForInOrder=new HashMap<>();
    public static TreeNode reConstructBinaryTree(int[] pre,int[] in){
        for(int i=0;i<in.length;i++){
            indexForInOrder.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }
    public static TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int inL){
        /*
        if(preL<preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex=indexForInOrder.get(root.val);
        int leftsize=inIndex-inL;
        root.left=reConstructBinaryTree(pre,preL+1,preR+leftsize,inL);
        root.right=reConstructBinaryTree(pre,preL+leftsize+1,preR,inL+leftsize+1);
        return root;
        */
        return null;
    }
}
