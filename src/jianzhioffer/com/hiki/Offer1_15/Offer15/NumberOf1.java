package jianzhioffer.com.hiki.Offer1_15.Offer15;
/*
    输入一个整数，输出该数二进制表示中 1 的个数。
        方法一：
            用1作与运算，然后左移，知道最后变为0
        方法二：时间复杂度：有多少个1就循环多少次
            1.把一个整数减1（二进制中最右边的1将会取反为0，而1右边的0都会取反为1）
            2.与原整数作与运算，这时候最右边的1会变成0
            3.循环直到整数变为0
 */
public class NumberOf1 {
    //方法一
    public int numberOf1(int n){
        int i=1;
        int count=0;
        while(i!=0){
            if((n&i)==i)
                count++;
            i=i<<1;
        }
        return count;
    }

    //方法二：
    public int numberOf1II(int n){
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
}
