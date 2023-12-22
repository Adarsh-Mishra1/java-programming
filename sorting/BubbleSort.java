//import java.util.*;
public class BubbleSort{
    public static void sort(int[] arr){
        //System.out.println(arr.length);
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            //This flag will stop the iteration if the list is already sorted, it will reduce the time complexity
            boolean flag=true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
                if(!flag){
                    return;
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr={9,7,8,6,5};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}