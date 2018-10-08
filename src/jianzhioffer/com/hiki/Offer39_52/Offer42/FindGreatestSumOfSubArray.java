package jianzhioffer.com.hiki.Offer39_52.Offer42;
/*
    连续子数组的最大和
    输入一个整型数组，数组里有整数负数。数组中的一个或连续多个整数组成一个子数组，求所有子数组的和的最大值
    要求时间复杂度为O(n)
    思路：
        从头到尾累加数字，并将和记录下来判断是否为最大
        累加的时候，如果上次和小于等于0，则抛弃原本的和，以新数字为起点开始累加
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0)
            return 0;
        int sum=0;
        int greatestSum=Integer.MIN_VALUE;
        for(int num:array){
            sum=sum<=0?num:sum+num;
            greatestSum=Math.max(sum,greatestSum);
        }
        return greatestSum;
    }
}
