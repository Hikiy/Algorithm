package jianzhioffer.com.hiki.Offer39_52.Offer43;
/*
    1~n整数中1出现的次数
    输入一个整数n，求1~n这n个整数的十进制表示中1出现的次数。
    思路：
        根据数学规律分部分求，判断首位数字是否为1，根据位数计算1出现的次数。
 */
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
