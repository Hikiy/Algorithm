package jianzhioffer.com.hiki.Offer16_26.Offer24;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;
/*
    输入一个链表，反转链表后，输出新链表的表头。
    思路：
        将后面的指针指向前面，第一个指向null
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ahead = head.next;
        ListNode rear = head;
        ListNode temp = null;
        while (ahead.next != null) {
            rear.next = temp;
            temp = rear;
            rear = ahead;
            ahead = ahead.next;
        }
        ahead.next = rear;
        rear.next = temp;
        return ahead;
    }
}
