package jianzhioffer.com.hiki.Offer27_38.Offer32;

import jianzhioffer.com.hiki.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
/*
    按之字形顺序打印二叉树
    请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
    第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
    思路：
        和第二题基本一样，就是需要判断一下将数组倒序；
 */
public class PrintFromTopToBottomIII {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        queue.add(pRoot);
        boolean flag=false;
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
            if(flag)
                Collections.reverse(arrayList);
            if(arrayList.size()!=0)
                ret.add(arrayList);
            flag=!flag;
        }
        return ret;
    }
}
