package jianzhioffer.com.hiki.Offer1_15.Offer14;
/*
    剪绳子
    把一根绳子剪成多段，并且使得每段的长度乘积最大。
        n = 2
        return 1 (2 = 1 + 1)
        n = 10
        return 36 (10 = 3 + 3 + 4)
    方法一：使用动态规划
        非常类似斐波那契数列一般从下而上的解法
        动态规划的特点：
            1.问题能分成若干个小问题
            2.问题是求一个最优解
            3.小问题之间有相互重叠的更小问题
            4.从上往下分析，从下往上求解问题
    方法二：贪婪算法
            每一次都取最优解，这种算法需要有数学方式来证明


 */
public class IntegerBreak {
    //动态规划法
    public int integerBreak(int n){
        if(n<2)
            return 0;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int[] product=new int[n+1];
        product[0]=0;
        product[1]=1;
        product[2]=2;
        product[3]=3;
        int max=0;
        for(int i=4;i<=n;i++){
            for(int j=1;j<=i/2;j++){
                int temp=product[j]*product[i-j];
                if(product[i]<temp)
                    product[i]=temp;
            }
        }
        return product[n];
    }
    //贪婪算法
    public int integerBreakII(int n){
        int timeOf3=n/3;
        if(n-timeOf3*3==1)
            timeOf3-=1;
        int timeOf2=(n-timeOf3*3)/2;
        return (int)Math.pow(3,timeOf3)*(int)Math.pow(2,timeOf2);
    }
}
