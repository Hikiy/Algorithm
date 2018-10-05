package jianzhioffer.com.hiki.Offer39_52.Offer39;

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
