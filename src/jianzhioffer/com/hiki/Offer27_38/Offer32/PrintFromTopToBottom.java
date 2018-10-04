package jianzhioffer.com.hiki.Offer27_38.Offer32;

import jianzhioffer.com.hiki.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
    从上往下打印二叉树
    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    思路：
        1.使用1个队列，将根节点，放入队列
        2.队列不为空则出队列打印并将左右结点进队列，知道队列为空

 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t == null)
                continue;
            ret.add(t.val);
            queue.add(t.left);
            queue.add(t.right);
        }
        return ret;
    }
}
