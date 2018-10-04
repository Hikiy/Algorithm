package jianzhioffer.com.hiki.Offer27_38.Offer35;
/*
    复杂链表的复制
    输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
    另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
    （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
    方法一：时间复杂度O(n^2)
        1.遍历一边 复制完。
        2.再遍历，找random结点，每一次需要吧克隆链表遍历一次
    方法二：时间复杂度O(n^2) 空间复杂度O(n^2)
        用hashmap，将每个结点key和克隆结点value存储。
        1.便利一边 复制完
        2.在便利，找random结点，这时候只需要将random结点在hashmap中找即可
    方法三：时间复杂度O(n^2)（本代码使用的方法）
        分为三步
        1.遍历，这时候每个克隆的节点放在每个原节点后面
        2.random赋值，原节点的random的下一节点即为克隆结点的random
        3.拆分，将原链表和克隆链表拆开

*/
public class RandomListNodeClone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)
            return null;
        RandomListNode cur=pHead;

        //克隆链表结点在每个结点后面
        while(cur!=null){
            RandomListNode clone=new RandomListNode(cur.label);
            clone.next=cur.next;
            cur.next=clone;
            cur=clone.next;
        }
        // 建立 random 链接
        cur=pHead;
        while(cur!=null){
            if(cur.random!=null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        //拆分
        RandomListNode clone=pHead.next;
        cur=pHead;
        while(cur.next!=null){
            RandomListNode next=cur.next;
            cur.next=next.next;
            cur=next;
        }
        return clone;
    }
}
