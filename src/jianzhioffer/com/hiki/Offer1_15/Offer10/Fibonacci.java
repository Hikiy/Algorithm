package jianzhioffer.com.hiki.Offer1_15.Offer10;
/*
    问题一：
    求斐波那契数列的第 n 项
            0               n=0
    f(n)=   1               n=1
            f(n-1)+f(n-2)   n>1

    方法一：最普通的方法，使用递归，这里就不码了
    方法二：时间复杂度高是因为很多重复计算，我们动态规划成多个
            子问题，然后将子问题缓存起来用。时间复杂度为O(n)
    方法三：考虑到第n项只和n-1和n-2有关系，所以只需要求出这两项
            这样更改空间复杂度由O(n)降低为O(1)
    方法四：如果还有n的大小限制，那可以先计算好结果，然后直接用
            时间复杂度为O(1)

    问题二：一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。
            求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
            其实就是斐波那契数列
    问题三：我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
            请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，
            总共有多少种方法？
    问题四：一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级...
            它也可以跳上 n 级。
            求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */

import java.util.Arrays;

//方法二
public class Fibonacci {
    public int fibonacci1(int n){
        if(n<=1){
            return n;
        }
        int[] fibonacci=new int[n+1];
        fibonacci[1]=1;
        for(int i=2;i<=n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci[n];
    }

    //方法三
    public int fibonacci2(int n){
        if(n<=1){
            return n;
        }
        int pre1=0,pre2=1,fib=0;
        for(int i= 2;i<=n;i++){
            fib=pre1+pre2;
            pre1=pre2;
            pre2=fib;
        }
        return fib;
    }

    //问题二：
    public int JumpFloor(int n){
        if(n<=2){
            return n;
        }
        int pre1=1,pre2=2,jf=0;
        for(int i=3;i<=n;i++){
            jf=pre1+pre2;
            pre1=pre2;
            pre2=jf;
        }
        return jf;
    }

    //问题四
    public int jumpFloorII(int target){
        int[] dp=new int[target];
        Arrays.fill(dp,1);
        for(int i=1;i<target;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j];
            }
        }
        return dp[target-1];
    }
    public static void main(String[] args){
        Fibonacci fib=new Fibonacci();
        System.out.println(fib.fibonacci1(6));
        System.out.println(fib.fibonacci2(6));
    }
}
