package jianzhioffer.com.hiki.Offer16_26.Offer20;
/*
    表示数值的字符串
        判断字符串是否在表达数值
        true
        "+100"
        "5e2" （e表示指数）
        "-123"
        "3.1416"
        "-1E-16"

        false
        "12e"
        "1a3.14"
        "1.2.3"
        "+-5"
        "12e+4.3"

        解法，使用正则表达式进行匹配
        []  ： 字符集合
        ()  ： 分组
        ?   ： 重复 0 ~ 1
        +   ： 重复 1 ~ n
        *   ： 重复 0 ~ n
        .   ： 任意字符
        \\. ： 转义后的 .
        \\d ： 数字
 */
public class IsNumber {
    public boolean isNumbner(char[] str){
        if(str==null||str.length==0)
            return false;
        return new String(str).matches("[+,-]?\\d*(\\.\\d*)?([e,E][+,-]?\\d+)?");
    }
}
