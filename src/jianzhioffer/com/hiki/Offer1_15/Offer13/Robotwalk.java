package jianzhioffer.com.hiki.Offer1_15.Offer13;
/*
    机器人的运动范围，有mxn的方格，地上有一个m行和n列的方格。
    一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
    但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，
    机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
    因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
        采用回溯法
        步骤：
        1.根据方格建立矩阵，存放每个格子的和
        2.构造boolean矩阵来判断这个格子能不能走。
        3.用递归根据机器人上下左右位移，判断矩阵的格子和是否大于k
        4.不大于则计数+1,
 */
public class Robotwalk {
    int[][] next={{0,-1},{0,1},{-1,0},{1,0}};
    int rows,cols;
    int[][] digitSum;
    int threshold;
    int count=0;
    public int movingCount(int threshold, int rows, int cols){
        this.threshold=threshold;
        this.rows=rows;
        this.cols=cols;
        initDigitSum();
        boolean[][] marked=new boolean[rows][cols];
        dfs(marked,0,0);
        return count;
    }

    public void dfs(boolean[][] marked,int r,int c){
        if(r<0||c<0||r>=this.rows||c>=this.cols||marked[r][c]) {
            return;
        }
        marked[r][c]=true;
        if(this.digitSum[r][c]>this.threshold)
            return;
        count++;
        for(int[] n:next){
            dfs(marked,r+n[0],c+n[1]);
        }
    }

    public void initDigitSum(){
        int[] digitOne=new int[Math.max(rows,cols)];
        for(int i=0;i<digitOne.length;i++){
            int n=i;
            while(n>0){
                digitOne[i]+=n%10;
                n=n/10;
            }
        }
        this.digitSum=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                this.digitSum[i][j]=digitOne[i]+digitOne[j];
            }
        }
    }

}
