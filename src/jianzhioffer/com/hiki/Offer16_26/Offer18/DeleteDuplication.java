package jianzhioffer.com.hiki.Offer16_26.Offer18;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;

/*
    18.2
    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
    重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为
     1->2->5

     利用递归
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode next=head.next;
        if(head.val==next.val){
            while(next!=null&&head.val==next.val){
                next=next.next;
            }
            return deleteDuplication(next);
        }
        else{
            head.next=deleteDuplication(next);
            return head;
        }
    }
}
