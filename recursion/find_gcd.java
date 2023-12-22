package recursion;

import java.util.Scanner;

public class find_gcd {
    //x%y
    static int using_recursion_gcd(int x,int y){
        //It is an Euclid Algorithm approach
        //Euclid Algo says: gcd(x,y)=gcd(x,x%y)
        //gcd(x,0)=0 becuase zero can be divided by any num but 5 is divided by greates divisior 5
        //if(x%y==0) {
        //or we can write i
        if(y==0){
            return x;
        }
        //System.out.println(x+" "+y);
        return using_recursion_gcd(y,x%y);
    }
    static int gcd(int x,int y){
        int rem=0;
        while (x%y!=0){
            rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println("Enter X and Y");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        //System.out.println(gcd(x,y));
        System.out.println(using_recursion_gcd(x,y));
    }
}
