package jianzhioffer.com.hiki.Offer1_15.Offer3;
/*输出数组中的其中一个重复数字
    步骤：
    1.遍历数组中的每个数
      判断数组下标与数是否相等，相等则下标+1
    2.下标与数不相等，判断 数 与 数组[数] 是否相等
        相等则有重复数字
    3.下标与数不相等， 数 与 数组[数] 也不相等，
        则将 数 与 数组[数] 的位置互换
        下标不用+1
   如果想不改变原先的数组，可以用克隆,
 */

public class DuplicationInArray {
    public static boolean duplicate(int[] numbers,int length,int[] duplication){
        boolean duplicate=false;
        if(numbers == null || numbers.length < 2 || length < 2 )
            return false;
        int i=0;
        while(i<length){
            int m=numbers[i];
            if(m==i)
                i++;
            else if(m!=numbers[m]){
                numbers[i]=numbers[m];
                numbers[m]=m;
            }
            else{
                duplication[0]=m;
                duplicate=true;
                break;
            }
        }
        return duplicate;
    }
    //测试
    public static void  main(String[] args){
        int[] a={2,3,1,0,2,5,3};
        int[] b={0};
        duplicate(a,a.length,b);
        System.out.println(b[0]);
    }
}
