package jianzhioffer.com.hiki.Offer16_26.Offer21;
/*
    调整数组顺序使奇数位于偶数前面
    需要保证奇数和奇数，偶数和偶数之间的相对位置不变

    解题思路：
        方法一：最简单的就是遍历，然后每找到偶数，就拿出来，后面的数字
                往前推，然后偶数插入到最后面，但是时间复杂度O(n^2);
        方法二：
            1.先遍历一边，计算出奇数的个数n。
            2.克隆一个数组出来，遍历克隆数组
            3.遇到奇数时，将奇数放到原数组从0开始的下标
            4.遇到偶数时，将偶数放到原数组从n开始的下标
            时间复杂度O(n)，但是要牺牲空间
 */
public class ReOrderArray {
    public void reOrderArray(int[] nums){
        if(nums==null)
            return;
        int n=0;
        for(int val:nums) {
            if (val % 2 == 1)
                n++;
        }
        int[] copy=nums.clone();
        int i=0;
        for(int j:copy){
            if(j%2==1)
                nums[i++]=j;
            else{
                nums[n++]=j;
            }
        }
    }
}
