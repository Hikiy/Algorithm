package jianzhioffer.com.hiki.Offer16_26.Offer16;
/*
    数值的整数次方
    给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，
    求 base 的 exponent 次方。
    考点：对边界值的分析

    步骤：
        1.判断次数，为0返回1，为1返回原数
        2.判断次数是否为负数，负数则做标记，在最后进行倒数处理
        3.偶数次数的运算可以用a^n/2 * a^n/2 来表示
          奇数次数的运算可以用a^n/2 * a^n/2 *a 来表示
          （感觉就是动态规划）
        4.算出结果后根据是否倒数处理数字得出结果
    细节优化：可以用>>1来代替/2因为位运算比乘除法和求余运算效率高
 */
public class Power {
    public double power(double base,int exponent){
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        boolean isNegative=false;
        if(exponent<0){
            isNegative=true;
            exponent=-exponent;
        }
        //这里的exponent/2可以用exponent>>1来代替，提高效率
        double pow=power(base*base,exponent/2);
        if(exponent%2!=0){
            pow=pow*base;
        }
        return isNegative? 1/pow:pow;
    }
}
