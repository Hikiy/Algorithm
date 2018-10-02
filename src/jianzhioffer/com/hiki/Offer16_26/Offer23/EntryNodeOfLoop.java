package jianzhioffer.com.hiki.Offer16_26.Offer23;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;
/*
    给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    思路：
        1.确认链表是否为环
        2.入口在哪里
    方法：
        1.用两个指针，fast走两步，slow走一步,若两个能相遇，则为环，否则不是环
        2.找到相遇点，fast一步步走并计数，再次和slow相遇，计数值为环长度n
        3.slow、fast回到头结点，fast先走n步，slow、fast都一步步走，直到
          slow和fast相遇，相遇点则为入口
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null||pHead.next.next==null)
            return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
        do{
            fast=fast.next.next;
            slow=slow.next;
        }while(slow!=fast&&fast.next!=null&&fast.next.next!=null);
        if(slow!=fast)
            return null;
        int count=0;
        do{
            fast=fast.next;
            count++;
        }while(fast!=slow);
        slow=pHead;
        for(int i=0;i<count;i++)
            fast=fast.next;
        while(slow!=fast) {
            slow = slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
