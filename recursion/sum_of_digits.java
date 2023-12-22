package recursion;
//Program to find the sum of every digit in a given value.
import java.util.Scanner;

public class sum_of_digits {
        static int sum_of_each_digits(int num){
            if(num>=0&&num<=9){
                return num;
            }
            
            return sum_of_each_digits(num%10)+sum_of_each_digits(num/10);
            //To count how many digits are there in this Number
            //return 1+sum_of_each_digits(num/10);
        }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //print(num);
        System.out.println(sum_of_each_digits(num));
        sc.close();
        
    }    
}
