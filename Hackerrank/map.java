import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class map {

    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        Map<Integer,String> mp1=new HashMap<>();
        System.out.println(mp.size());
        //Inserting the Element
        mp.put("first", 1);
        mp.put("second", 2);
        mp.put("third", 3);
        
        mp1.put(1, "first");
        mp1.put(2, "Second");
        mp1.put(3, "Third");

        System.out.println(mp);
        System.out.println(mp1);

        //Updating the Element
        mp1.put(3, "Three");
        mp.put("third", 33);

        System.out.println("After Update");
        System.out.println("Map "+mp);
        System.out.println("Map1:"+mp1);

        //Removing the element
        mp1.remove(3);
        System.out.println("After Removed"+mp1);
        System.out.println("Iteration :");
        for (Map.Entry<Integer,String> e: mp1.entrySet()) {
            System.out.println("key :"+e.getKey()+" value: "+e.getValue());
        }

        System.out.println("Getting all key in a set: ");
        
        Set<Integer> s=mp1.keySet();
        for(int key:s){
            System.out.println("Keys: "+key);
        }
    }
}
