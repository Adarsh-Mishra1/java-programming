import java.io.*;
import java.util.*;
import java.lang.String;

public class Tokens_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        String[] arr=s.split("[\\s!?,._'@]+");
        /*
        \\s: Represents whitespace characters, including spaces, tabs, and line breaks.
        +: Indicates that one or more occurrences of the characters in                   
        character class should be treated as a single delimiter.
        */
        
        int count=arr.length;
        System.out.println(count);
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        for(String word:arr){
            //count++;
            System.out.println(word);
        }
        scan.close();
    }
}

