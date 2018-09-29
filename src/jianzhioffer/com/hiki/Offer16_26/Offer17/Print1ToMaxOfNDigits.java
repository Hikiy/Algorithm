package jianzhioffer.com.hiki.Offer16_26.Offer17;
/*
    打印从 1 到最大的 n 位数
    输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
    比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。

    解题思路：
    由于 n 可能会非常大，因此不能直接用 int 表示数字，而是用 char 数组进行存储。
    使用回溯法得到所有的数。
    步骤：
        创建字符数组，通过回溯法，将‘0’到‘9’递归。
        输出的时候判断前面的0不打印
 */
public class Print1ToMaxOfNDigits {
    public static void print1ToMaxOfNDigits(int n){
        if(n<=0)
            return;
        char[] number=new char[n];
        print1ToMaxOfNDigits(number,0);
    }

    public static void print1ToMaxOfNDigits(char[] number,int digit){
        if(digit==number.length){
            print(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[digit]=(char)('0'+i);
            print1ToMaxOfNDigits(number,digit+1);
        }
    }

    public static void print(char[] number){
        int index=0;
        //注意这两个条件顺序不能反，因为会溢出
        while(index<number.length&&number[index]=='0')
            index++;
        while(index<number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    public static void main(String[] args){
        print1ToMaxOfNDigits(3);
    }
}
