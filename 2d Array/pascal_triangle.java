import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of Rows:");
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=0;i<=row;i++){   
            for(int j=1;j<row-i;j++){
               System.out.print(" "); 
            }    
            for(int j=0;j<=i;j++){
               System.out.print(combination(i,j)+" "); 
            }    
            System.out.println("");
        }
        sc.close();

        //System.out.print(combination(3,2)); 
    }
    
    public static long combination(int n,int r){
        int numerator=1,denominator=1;
        if(r==0||r==n){
            return 1;
        }
        //In combination when we solve the n!/r!*n-r! we get the following pattern when we solve, which i implemented here
        //Take idea from striver bhaiy
        for(int i=1;i<=r;i++){
            numerator*=n;
            denominator*=i;
            //System.out.print(res);
            n--;
        }
        return (numerator/denominator);
    }
}
