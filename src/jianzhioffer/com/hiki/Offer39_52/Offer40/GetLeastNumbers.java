package jianzhioffer.com.hiki.Offer39_52.Offer40;

import java.util.ArrayList;
import java.util.PriorityQueue;

/*
    最小的K个数
    输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
    思路：
        方法一：
    采用快速排序的Partition方法，当下标刚好为k，说明前面k个数字为最小的k个数，但是这个方法会改变原数组
    复杂度：O(N) + O(1)
        方法二：
    使用大顶堆来维护最小堆，而不能直接创建一个小顶堆并设置一个大小，企图让小顶堆中的元素都是最小元素。
    维护一个大小为 K 的最小堆过程如下：在添加一个元素之后，如果大顶堆的大小大于 K，
    那么需要将大顶堆的堆顶元素去除。
    复杂度：O(NlogK) + O(K)，特别适合处理海量数据
 */
public class GetLeastNumbers {
    //方法一部分
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] nums, int k) {
        ArrayList<Integer> ret=new ArrayList<>();
        if(k>nums.length||k<=0)
            return ret;
        findLeastNumber(nums,k);
        for(int i=0;i<k;i++){
            ret.add(nums[i]);
        }
        return ret;
    }
    public void findLeastNumber(int[] nums,int k){
        int l=0,h=nums.length-1;
        int mid;
        while(l<h){
            mid=partition(nums,l,h);
            if(mid==k)
                break;
            if(mid<k)
                l=mid+1;
            else
                h=mid-1;
        }
    }
    //快速排序
    public int partition(int[] nums,int l,int h){
        int temp=l;
        int mid=nums[l];
        h=h+1;
        while(l!=h) {
            while (l < h && nums[--h] > mid) ;
            while (l < h && nums[++l] < mid) ;
            if (l != h)
                swap(nums, l, h);
            else
                break;
        }
        //将中间数进行对调
        swap(nums,temp,h);
        return l;
    }
    public void swap(int[] nums,int l,int h){
        int temp=nums[l];
        nums[l]=nums[h];
        nums[h]=temp;
    }

    //方法二部分
    public ArrayList<Integer> GetLeastNumbers_SolutionII(int[] nums, int k) {
        if(k>nums.length||k<=0)
            return new ArrayList<>();
        //这里的(o1, o2) -> o2 - o1是处理优先级的东西,如果没有这个处理，将会是大顶堆
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((o1, o2) -> o2 - o1);
        for(int num:nums){
            maxHeap.add(num);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }
}
