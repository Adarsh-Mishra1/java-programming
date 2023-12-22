package LeetCode;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class HasMap_Example {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
    
        int[] arr={2,2,4,4,5,6,7};
        for(int item:arr){
            set.add(item);
        }
        arr=new int[0];
        for(int item:arr){
            set.add(item);
        }

        //arr=set.toArray(new Integer[0]);
        for(int item:arr){
            System.out.println(item);
        }
        int size=arr.length;
        //System.out.println(set+"Size="+set.size());
    }
}
