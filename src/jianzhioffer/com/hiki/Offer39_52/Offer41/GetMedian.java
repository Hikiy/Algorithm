package jianzhioffer.com.hiki.Offer39_52.Offer41;

import java.util.PriorityQueue;

public class GetMedian {
    /* 大顶堆，存储左半边元素 */
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    /* 小顶堆，存储右半边元素，并且右半边元素都大于左半边 */
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    /* 当前数据流读入的元素个数 */
    private boolean isEven = false;

    public void Insert(Integer num) {
        if(isEven){
            left.add(num);
            right.add(left.poll());
        }
        else{
            right.add(num);
            left.add(right.poll());
        }
        isEven=!isEven;
    }

    public Double GetMedian() {
        //上个数字是偶数
        if(!isEven){
            return (left.peek()+right.peek())/2.0;
        }
        else{
            return (double)left.peek();
        }
    }
}
