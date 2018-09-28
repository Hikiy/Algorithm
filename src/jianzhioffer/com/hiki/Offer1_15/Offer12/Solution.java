package jianzhioffer.com.hiki.Offer1_15.Offer12;
/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。

    用回溯法，使用boolen矩阵判断是否走过，然后用递归进行筛选
 */

public class Solution {
    //分别为左右上下
    private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int cols;

    public boolean hasPath(char[] array, int rows, int cols, char[] str){
        if(rows<=0||cols<=0){
            return false;
        }
        this.rows=rows;
        this.cols=cols;
        char[][] matrix=buildMatrix(array);
        boolean[][] marked=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(backtracking(matrix,str,marked,0,i,j)){
                   return true;
               }
            }
        }
        return false;
    }
    public char[][] buildMatrix(char[] array){
        char[][] matrix=new char[rows][cols];
        int index=0;
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                matrix[i][j]=array[index];
                index++;
            }
        }
        return matrix;
    }

    public boolean backtracking(char[][] matrix,char[] str,boolean[][] marked,
                                int pathLen,int r,int c){
        if (pathLen == str.length)
            return true;
        //判断该次字符是否符合
        if (r < 0 || r >= rows || c < 0 || c >=cols || matrix[r][c] != str[pathLen] || marked[r][c])
            return false;
        marked[r][c]=true;
        for(int[] n:next){
            if(backtracking(matrix,str,marked,pathLen+1,r+n[0],c+n[1])) {
                return true;
            }
        }
        marked[r][c]=false;
        return false;
    }
}
