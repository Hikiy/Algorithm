package jianzhioffer.com.hiki.Offer1_15.Offer9;

import java.util.Stack;
/*
    用两个栈实现队列的push 和 pop
    步骤：
        1.构造两个栈，in 和 out
        2.push的时候，将数据push到栈in中
        3.pop的时候要分情况：
            如果out是空的，从in中把所有数字pop出并push到out中，
                然后out pop出来
            如果out为空并且in也为空，则抛出异常，队列为空
            如果out不为空，out直接pop

 */
public class TwoStackToQueue {
    Stack<Integer> in=new Stack<>();
    Stack<Integer> out=new Stack<>();
    public void push(int node){
        in.push(node);
    }
    public int pop()throws Exception{
        if(out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if(out.isEmpty()){
            throw new Exception("queue is empty!");
        }
        return out.pop();
    }
}
