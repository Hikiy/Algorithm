package jianzhioffer.com.hiki.Offer39_52.Offer39;
/*
    数组中出现次数超过一半的数字
    多数投票问题，可以利用 Boyer-Moore Majority Vote Algorithm
    来解决这个问题，使得时间复杂度为 O(N)。
    思路：
    首先数组是排序好的。
    使用 cnt 来统计一个元素出现的次数，当遍历到的元素和统计元素相等时，
    令 cnt++，否则令 cnt--。如果前面查找了 i 个元素，且 cnt == 0，
    说明前 i 个元素没有 majority，或者有 majority，但是出现的次数少于 i / 2 ，
    因为如果多于 i / 2 的话 cnt 就一定不会为 0 。
    cnt>0的有望成为要找majority，但是有可能是因为是结尾数字，所以要多加一次判断：
    遍历多一次数组，统计majority出现的次数，如果大于一半，则是要找的数字

 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] nums) {
        int majority=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            cnt= nums[i]==majority?cnt+1:cnt-1;
            if(cnt==0){
                majority=nums[i];
                cnt=1;
            }
        }
        cnt=0;
        for(int val:nums){
            if(val==majority)
                cnt++;
        }
        return cnt>nums.length/2?majority:0;
    }
}
