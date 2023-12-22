package LeetCode;
import java.util.*;
public class Add_Two_Number {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();
        LinkedList<Integer> l3=new LinkedList<Integer>();

        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.add(7);

        l2.add(7);
        l2.add(0);
        l2.add(8);

        System.out.println(l1);
        System.out.println(l2);
        int size1=l1.size();
        int size2=l2.size();
        int sum=0,carry=0;
        while(!l1.isEmpty()||!l2.isEmpty()){
            int x=l1.isEmpty()?0: l1.removeFirst();
            int y=l2.isEmpty()?0: l2.removeFirst();
            //System.out.println(x);
            sum=x+y+carry;
            carry=sum/10;
            l3.add(sum%10);
        }
        System.out.println(l3);
        LinkedList<Integer> f=new LinkedList<>();
        while(!l3.isEmpty()){
            f.add(l3.removeLast());
        }
        System.out.println();
    }

}
