import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int counterNegativeSubArrays = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for(int j = 0; j < array.length; j++) {
            for (int k = j; k < array.length; k++) {
                System.out.print(array[j]+" ");
                sum += array[k];
                if (sum < 0){
                    counterNegativeSubArrays++;
                }    
            }
            sum = 0;
        }
        //System.out.print(counterNegativeSubArrays);
}
}