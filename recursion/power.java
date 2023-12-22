package recursion;

import java.util.Scanner;

public class power {
    static int pow(int num,int p){
        if(p==0)
            return 1;
        return num*pow(num,p-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        //print(num);
        System.out.println(pow(num,pow));
    }
}
// Time Complexit: o(q)