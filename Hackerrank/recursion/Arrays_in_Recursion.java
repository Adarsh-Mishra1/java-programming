package recursion;

import java.util.Scanner;

public class Arrays_in_Recursion
{
    static boolean linear_search(int[] arr,int target,int idx){
        if(idx>=arr.length-1) return false;
        if(arr[idx]==target) return true;
        return linear_search(arr,target,idx+1);
    }

    //if not found return -1
    static int return_index_if_exist(int[] arr,int target,int idx){
        if(idx>=arr.length-1) return -1;
        if(arr[idx]==target) return idx;
        return return_index_if_exist(arr,target,idx+1);
    }
    static void print_occurunc(int[] arr,int target,int idx){
        if(idx>=arr.length) return;
        if(arr[idx]==target){
            System.out.println(arr[idx]);
        }
        print_occurunc(arr,target,idx+1);
    }
    static int sum(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        //This function call will give me previous num in sum var, then i will add the current idx value
        //with previous sum and this circle will goes continuously back 
        int sum=sum(arr,idx+1);
        return sum+arr[idx];
    }
    static int greatest(int[] arr,int idx){
            if(idx==arr.length-1){
                return arr[idx];
            }
            int curr=greatest(arr,idx+1);
            return Math.max(curr,arr[idx]);
    }
    static int greatest2(int[] arr,int idx){
        if(idx==0){
            return arr[idx];
        }
        int curr=greatest2(arr,idx-1);
        //System.out.println("c:"+curr+" "+"idx:"+idx);
        return Math.max(curr,arr[idx]);
    }
    static void reverse(int[] arr,int i){
        if(i==arr.length)
            return;
        System.out.println(arr[i]);
        reverse(arr,i+1);
        //System.out.println("Bottom"+arr[i]);
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,3,5};
        //reverse(arr,0);
        //System.out.println(greatest2(arr, arr.length-1));
        //System.out.println(greatest(arr,0));
        System.out.println(sum(arr,0));
        System.out.println("Element exists: Index"+return_index_if_exist(arr,3,0));

        //Printing the all occurance of any element
        print_occurunc(arr,5,0);

        //Searching if element exits or not
        if(linear_search(arr,1,0)){
            System.out.println("Element Exits");
        }else{
            System.out.println("Not Exits");
        }

    }
}
