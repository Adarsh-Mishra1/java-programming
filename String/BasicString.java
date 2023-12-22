package String;

import java.util.ArrayList;

public class BasicString
{
    public static boolean isValid(String s) {
        int rnd_l=0,rnd_r=0,sqr_l=0,sqr_r=0;
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            if(s.charAt(i)=='('){
                rnd_l++;
            }
            if(s.charAt(i)==')'){
                rnd_r++;
            }
            if(s.charAt(i)=='['){
                sqr_l++;
            }
            if(s.charAt(i)==']'){
                sqr_r++;
            }
        }
        if(sqr_l!=sqr_r){
            return false;
        }
        if(rnd_l!=rnd_r){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[][] str1= {{"Adarsh"}, {"Mishra"}};
        String[] str= {"first","second"};
        //System.out.println(str[0]+" "+str[1]);
        //System.out.println(str1[0][0].charAt(0)+" "+str1[1][0]);
        String test="adr";
        String res="";
        for(int i=test.length()-1;i>=0;i--){
            res+=test.charAt(i);
        }
       System.out.print(res);
    }
}
