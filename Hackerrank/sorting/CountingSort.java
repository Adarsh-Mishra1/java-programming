import java.util.Arrays;

public class CountingSort {

    static void countingsort(int[] arr){
        int max= arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //System.out.println(max);
        //Creating Array of max size
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        display(freq);
        //Now finding cumulative sum
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        display(freq);
        int output[]=new int[max+1];
        //Creating output array to store sorted elements
        for(int i=0;i<arr.length;i++){
            output[freq[arr[i]]-1]=arr[i];
            freq[arr[i]]--;
        }
        display(output);
    }
    static void display(int[] arr){
        System.out.print("\nArray is:");
        for(int item:arr){
            System.out.print(" "+item);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,9,3,3,2,7};
        display(arr);
        countingsort(arr);

    }
}
