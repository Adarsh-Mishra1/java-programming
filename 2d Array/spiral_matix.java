import java.util.Scanner;

public class spiral_matix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows and Columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        //Creating Array
        int[][] arr=new int[row][col];
        
        //Taking Input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //Initializing Boundaries
        int top=0,bottom=row-1,left=0,right=col-1;
        int total=row*col;
        while(total>0){
            
            for(int j=top;j<=right&&total>0;j++){
                System.out.print(arr[top][j]+" ");
                total--;
            }    
            top++;
            for(int j=top;j<=bottom&&total>0;j++){
                System.out.print(arr[j][right]+" ");
                total--;
            }    
            right--;
            for(int j=right;j>=left&&total>0;j--){
                System.out.print(arr[bottom][j]+" ");
                total--;
            }    
            bottom--;
            for(int j=bottom;j>=top&&total>0;j--){
                System.out.print(arr[j][left]+" ");
                total--;
            }    
            left++;
        }
        sc.close();

    }
}
