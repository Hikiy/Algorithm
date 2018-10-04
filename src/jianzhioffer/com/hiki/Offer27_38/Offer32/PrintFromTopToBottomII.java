package jianzhioffer.com.hiki.Offer27_38.Offer32;

import jianzhioffer.com.hiki.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
    把二叉树打印成多行
    从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    思路：
        和上一个题很像，但是上一题是一个个添加进链表，这次是一层一层加进去。
 */
public class PrintFromTopToBottomII {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            int cnt=queue.size();
            ArrayList<Integer> arrayList=new ArrayList<>();
            while(cnt-- >0){
                TreeNode t=queue.poll();
                if(t==null)
                    continue;
                arrayList.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if(arrayList.size()!=0)
                ret.add(arrayList);
        }
        return ret;
    }
}
