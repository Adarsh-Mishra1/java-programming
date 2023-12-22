
import java.util.Scanner;

public class transpose {

    public static void print(int[][] arr){
        
        //length of rows
        int r=arr.length;
        int c=arr[0].length;
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void reverse_array(int[]arr){
        int i=0,j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[][] arr){
        //To reverse the matrix we need to transepose first then reverse
        findtranspose_without_new_array(arr);
        System.out.println("Transposed Matrix");
        print(arr);
        for(int i=0;i<arr.length;i++){
            reverse_array(arr[i]);
        }
    }

    public static int[][] findtranspose(int[][] a){
        //length of rows
        int r=a.length;
        int c=a[0].length;
        int b[][]=new int[c][r];
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[j][i]=a[i][j];
            }
        }
        return b;
    }

    //Keep in mind without using new array will work only for square matrix, not for all matrix
    public static void findtranspose_without_new_array(int[][] a){
        //length of rows
        int r=a.length;
        int c=a[0].length;
        int temp;
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j>=i){
                    temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //Finding Transpose
        
        System.out.println("Original Matrix:");
        print(a);
        //int[][] ans=findtranspose(a);
        //findtranspose_without_new_array(a);
        rotate(a);
        //System.out.println("Transposed Matrix");
        System.out.println("Rotated Matrix Matrix");
        print(a);
        sc.close();
    }    
}
