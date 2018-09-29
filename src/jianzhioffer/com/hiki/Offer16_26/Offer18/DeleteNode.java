package jianzhioffer.com.hiki.Offer16_26.Offer18;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;

/*
    18.1
    在 O(1) 时间内删除链表节点
    给了头结点和要删除的结点。

    步骤：
        1.将要删除的结点的next值赋值给要删除的结点，然后将next指针指向下一个结点，
        变相实现删除原结点。O（1）
        2.如果是尾结点，则需要顺序遍历
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete){
        if(head==null||tobeDelete==null)
            return null;
        if(tobeDelete.next!=null){
            tobeDelete.val=tobeDelete.next.val;
            tobeDelete.next=tobeDelete.next.next;
        }
        else{
            ListNode cur=head;
            while(cur.next!=tobeDelete)
                cur=cur.next;
            cur.next=null;
        }
        return head;
    }
}
