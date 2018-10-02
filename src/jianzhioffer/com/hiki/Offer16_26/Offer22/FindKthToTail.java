package jianzhioffer.com.hiki.Offer16_26.Offer22;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;
/*
    返回链表中倒数第 K 个结点
    方法：
        用两个指针，前指针先走K-1个结点，后指针再走
        知道前指针到尾指针，这时候后指针即为需要找的结点
        主要是要注意鲁棒性问题
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if(head==null)
            return null;
        if(k<1)
            return null;
        ListNode pre=head;
        for(int i=1;i<k;i++) {
            if (pre.next != null)
                pre=pre.next;
            else
                return null;
        }
        ListNode target=head;
        while(pre.next!=null){
            target=target.next;
            pre=pre.next;
        }
        return target;
    }
}
