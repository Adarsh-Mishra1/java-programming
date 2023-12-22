package recursion;

import java.util.Scanner;

public class String_Recursion {
        static String reverse(String str,int idx){
            // base case. last call will return empty string
            if(idx>str.length()-1){
                return "";
            }
            //prev char is caming from previous call
            String prev=reverse(str,idx+1);
            //current call function char
            char curr=str.charAt(idx);
            //concatenation prevous+current char in reverse form to return
            return prev+curr;
        }
        //It will remove the given character
        static String occurance(String str,int idx){
            //last call will return ""
            if(idx>str.length()-1){
                return "";
            }

            String prev=occurance(str,idx+1);
            char curr=str.charAt(idx);
            if(curr!='a') {
                return curr + prev;
            }{
                return prev;
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       //System.out.println(reverse(str,0));
        System.out.println(occurance(str,0));
    }
}
