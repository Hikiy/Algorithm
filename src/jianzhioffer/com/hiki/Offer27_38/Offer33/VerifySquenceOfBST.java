package jianzhioffer.com.hiki.Offer27_38.Offer33;
/*
    二叉搜索树的后序遍历序列
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
    思路：
        后序遍历最后一个节点为根节点
        前面一部分都小于根节点的为左子树
        后面一部分都大于根节点的为右子树
        1.先找出前面第一个不小于根节点的位置
        2.从这个位置到根节点，如果有小于根节点的结点，则不是二叉搜索树
        3.接着在这两个左右子树重复1-2步骤
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        return verify(sequence,0,sequence.length-1);
    }

    public boolean verify(int[] sequence,int first,int last){
        if(last-first<=1)
            return true;
        int value=sequence[last];
        int cut=first;
        while (sequence[cut]<value){
            cut++;
        }
        int mincut=cut;
        while(sequence[mincut]>value){
            mincut++;
        }
        if(mincut!=last)
            return false;

        return verify(sequence, first, cut - 1) && verify(sequence, cut, last - 1);

    }
}
