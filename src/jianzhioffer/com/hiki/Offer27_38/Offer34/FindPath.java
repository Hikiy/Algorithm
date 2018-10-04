package jianzhioffer.com.hiki.Offer27_38.Offer34;

import jianzhioffer.com.hiki.TreeNode;

import java.util.ArrayList;
/*
    二叉树中和为某一值的路径
    输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
    路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    (注意: 在返回值的list中，数组长度大的数组靠前)

    思路：
        因为是路径，所以要用到递归。
        因为是路径，所以要将路径记录下来

 */
public class FindPath {
    ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> path=new ArrayList<>();
        FindPath(root,target,path);
        return ret;
    }
    public void FindPath(TreeNode root,int target,ArrayList<Integer> path){
        if(root==null)
            return;
        path.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null)
            //这里用new ArrayList<>(path)是因为是引用类型，所以要新建一个对象，不然最后path都remove完
            //了，也就是会变成全都是空的情况
            ret.add(new ArrayList<>(path));
        else{
            FindPath(root.left,target,path);
            FindPath(root.right,target,path);
        }
        path.remove(path.size()-1);
    }
}
