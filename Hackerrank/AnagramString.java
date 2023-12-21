
import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

    static boolean isAnagram(String x, String y) {
        // Complete the function
        String a=x.toUpperCase();
        String b=y.toUpperCase();
        int counta=0;
        int countb=0;
        HashMap<Character,Integer> freqa=new HashMap<>();
        HashMap<Character,Integer> freqb=new HashMap<>();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    counta++;
                    freqa.put(a.charAt(i), counta); 
                }
            }
            counta=0;
        }
        
        for(int i=0;i<b.length();i++){
            for(int j=0;j<b.length();j++){
                if(b.charAt(i)==b.charAt(j)){
                    countb++;
                    freqb.put(b.charAt(i), countb); 
                }
            }
            countb=0;
        }
        System.out.println(freqa);
        System.out.println(freqb);
        boolean areEqual = freqa.equals(freqb);
        return areEqual;

        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

