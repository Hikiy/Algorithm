package jianzhioffer.com.hiki.Offer1_15.Offer5;
/*
将字符串中的空格换成%20
步骤：
    使用StringBuffer，使用.charAt(i)判断字符是否为空格，空格则
    appened %20
 */
public class Offer5 {
    public static StringBuffer ReplaceBlank(StringBuffer str){
        if(str==null){
            return null;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("We are happy!");
        System.out.println(ReplaceBlank(sb));
    }
}
