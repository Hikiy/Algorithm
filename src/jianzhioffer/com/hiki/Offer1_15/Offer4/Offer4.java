package jianzhioffer.com.hiki.Offer1_15.Offer4;
/*
二维数组中查找整数
二维数组从左到右递增，从上到下递增
步骤：
    1.取右上角的数，对比查找数
    2.大于查找数，剔除这一行的数
    3.小于查找数，剔除这一列的数
 */
public class Offer4 {
    public static boolean find(int [][] numbers, int target){
        if(numbers==null){
            return false;
        }
        int row=0;
        int column=numbers[0].length-1;
        while(row<numbers.length && column>0){
            if(numbers[row][column]==target){
                return true;
            }
            else if(numbers[row][column]>target){
                column--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] numbers= {{1,2,8,9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};

        System.out.println(find(numbers,16));
    }
}
