package jianzhioffer.com.hiki.Offer16_26.Offer25;

import jianzhioffer.com.hiki.Offer1_15.Offer6.Offer6.ListNode;
/*
    合并两个排序的链表
 */
public class Merge {
    //方法一：迭代
    public ListNode merge(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode head=null;
        if(list1.val>list2.val) {
            head = list2;
            list2=list2.next;
        }
        else {
            head = list1;
            list1 = list1.next;
        }
        ListNode temp=head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val) {
                temp.next = list2;
                list2=list2.next;
                temp=temp.next;
            }
            else{
                temp.next = list1;
                list1=list1.next;
                temp=temp.next;
            }
        }
        if(list1==null)
            temp.next=list2;
        if(list2==null)
            temp.next=list1;
        return head;
    }

    //方法二：更简便，也是迭代
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;
        return head.next;
    }

    //方法三：递归
    public ListNode MergeIII(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val) {
            list1.next = MergeIII(list1.next, list2);
            return list1;
        } else {
            list2.next = MergeIII(list1, list2.next);
            return list2;
        }
    }
}
