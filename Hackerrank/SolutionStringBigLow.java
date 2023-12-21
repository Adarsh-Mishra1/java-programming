import java.util.Scanner;


public class SolutionStringBigLow {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = smallest;
        //String temp=s.substring(0, 2);
        String allsubstring="";
        for(int i=0;i<=s.length()-k;i++){
            allsubstring=s.substring(i, i+k);
            if(largest.compareTo(s.substring(i, i+k))<0){
                largest=allsubstring;
            }
            if(smallest.compareTo(s.substring(i, i+k))>0){
                smallest=allsubstring;
            }
            /* 
            if(largest.charAt(0)<allsubstring.charAt(0)){
                largest=allsubstring;
            }
            if(smallest.charAt(0)>allsubstring.charAt(0)){
                smallest=allsubstring;
            }
            */
            //System.out.println(s.substring(i, i+k));
           
        }
        //s.substring(i, i+3);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}