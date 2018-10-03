package jianzhioffer.com.hiki.Offer27_38.Offer28;

import jianzhioffer.com.hiki.Offer16_26.Offer26.HasSubtree.TreeNode;
/*
    对称的二叉树
    请实现一个函数，用来判断一颗二叉树是不是对称的。
    注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
    思路：
        一个用前序遍历，一个用中右左的方式遍历，两个遍历一样则为对称
 */
public class IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
            return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    public boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null)
            return true;
        if(t1==null||t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return isSymmetrical(t1.left,t2.right)&&isSymmetrical(t1.right,t2.left);
    }
}
