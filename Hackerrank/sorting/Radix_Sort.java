import java.util.Arrays;

public class Radix_Sort {

    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void sort(int[] arr,int exp){
        //10 size array becuase every time we are working on sigle digit
        //0-9 Total 10 places needed
        int[] freq=new int[10];
        //To store result
        //System.out.println(exp);

        int[] output=new int[arr.length];
        //print(freq);

        for(int i=0;i<=arr.length-1;i++){
            freq[(arr[i]/exp)%10]++;
        }
        //print(freq);
        for(int i=1;i<=freq.length-1;i++){
            freq[i]+=freq[i-1];
        }
        //print(arr);
        //print(freq);
        for(int i=arr.length-1;i>=0;i--){
            output[freq[(arr[i] / exp) % 10] - 1] = arr[i];
            freq[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
        //print(arr);

    }

    static void radixsort(int[] arr){
        int max=getMax(arr,arr.length-1);
        for(int exp=1;max/exp>0;exp*=10) {
            //exp will be 1,10,100...It is upto the number of digit max contains
            sort(arr,exp);
        }

    }
    static void print(int[] a)
    {
        System.out.println();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        {
            int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
            int n = arr.length;

            // Function Call
            radixsort(arr);
            print(arr);
        }
    }
}
