package LeetCode;

public class Solution {
    public static void onesMinusZeros(int[][] grid) {
        int[][] res=new int[3][3];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                for(int k=0;k<grid.length;k++){
                    System.out.println(grid[k][i]);
                }
                //System.out.print(sum);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        onesMinusZeros(arr);
    }
}
