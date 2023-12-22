package recursion;
//Using Long Division method to find gcd or hcf
// x=8,y=3
/* 
    3)8(2
     _6_
     2)3(1
      _2_
     1)2(2
        _2_
        _0_
    GCD of 8,3=1(last division) ans

    Condition:
        Here x=8,y=3 then 1 is ans but if we change x=3 y=8 ans will be same no effect beacuse 
        first divsion will swap the both values
*/
import java.util.Scanner;

public class sum_of_num {
    static int sum(int n){
        if(n==0||n==1){
            return n;
        }
        
        return n+sum(n-1);
    }


    static void print(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //print(num);
        System.out.println(sum(num));

        sc.close();
        
    }    
}
