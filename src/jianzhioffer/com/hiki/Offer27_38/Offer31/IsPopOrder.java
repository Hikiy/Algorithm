package jianzhioffer.com.hiki.Offer27_38.Offer31;

import java.util.Stack;
/*
    栈的压入、弹出序列
    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否
    为该栈的弹出顺序。假设压入栈的所有数字均不相等。
    例如序列 1,2,3,4,5 是某栈的压入顺序，序列 4,5,3,2,1
    是该压栈序列对应的一个弹出序列，
    但 4,3,5,1,2 就不可能是该压栈序列的弹出序列。
    思路：
        使用栈来模拟是否可以按照输出序列输出
        判断栈顶是否为输出序列的当前值，若不是则继续进栈
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int n=pushA.length;
        for(int pushIndex=0,popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushA[pushIndex]);
            while(popIndex<popA.length&&popA[popIndex]==stack.peek()){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
