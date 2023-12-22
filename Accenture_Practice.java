import java.util.ArrayList;
import java.util.HashMap;



public class Accenture_Practice {
    public static void basics(){
        char x='a';
        int y=(int)(x);
        int[] arr=new int[256];
        //System.out.println(y);
        String str="adarsh";
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>(4);
        for(int i=0;i<str.length();i++){
            //hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);

            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        ArrayList<Integer> ls=new ArrayList<>();

        //hm.get('a');
        //System.out.println(hm);

    }
    public static void findmissingnum(){
         int[] arr={1,2,3,5,9,10,11};
         for(int i=1;i<arr.length-1;i++){
             if((arr[i]!=arr[i-1]+1)&&(arr[i]-1!=arr[i])){
                 System.out.println(arr[i]);
                 break;
             }
         }
    }
    public static void main(String[] args) {
        findmissingnum();
    }
}
