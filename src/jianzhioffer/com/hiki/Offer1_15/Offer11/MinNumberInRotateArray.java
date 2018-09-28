package jianzhioffer.com.hiki.Offer1_15.Offer11;
/*
    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    步骤：
        利用二分查找法，若中位小于等于高位，则高位取中位。
                        （因为有可能中位就是那个最小数）
                        若中位大于高位，则低位等于中位+1；
    折半特性的算法时间复杂度都为 O(logN)。
    补充：  如果数组可以重复，那么本方法会有bug，比如数组{1,1,1,0,1}
            会找不到0的位置，这时候要用顺序查找
            一开始加多一个判断：
            if (nums[l] == nums[m] && nums[m] == nums[h])
                    //进行顺序查找
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int h=nums.length-1,l=0;
        while(l<h){
            int m=(l+h)/2;
            if(nums[m]<=nums[h]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return nums[l];
    }
}
