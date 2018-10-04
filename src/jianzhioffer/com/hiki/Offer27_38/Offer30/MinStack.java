package jianzhioffer.com.hiki.Offer27_38.Offer30;

import java.util.Stack;
/*
    包含min函数的栈
    定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
    （时间复杂度应为O（1））。
    思路：
        创建多一个栈，用于存放最小值。每次push的时候，也往最小栈里push最小值，
        每次pop的时候最小栈也pop，这样就能保证最小栈的top元素是最小值
 */
public class MinStack {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(node,minStack.peek()));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
