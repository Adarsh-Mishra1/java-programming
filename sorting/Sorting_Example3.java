public class Sorting_Example3
{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Using Two pointer method
    static void sort2(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]<0) left++; //while we are getting negative at left just go ahead left
            while(arr[right]>=0) right--;//while we are getting positive at right just go and right--
            swap(arr,right,left);//while will iteratre while condition satisfied after that swap will swap where
            //conditon not satisfied
            left++;
            right--;
            //after swapping move the pointer again
        }
    }
    static void sort(int[] arr){ //Using Quick Sort method
        //Just considering zero as middle element to compare positive and negative values
        //the perform the comparison ans swap the values inside the array
        int size=arr.length-1;
        int i=-1;
        int pivot=0;
        for(int j=0;j<=size;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,-3,5,9,-11,-8,14}; //using pivot method of quick sorting
        int arr2[]={5,6,-2,4,6,7,-9,3};//Using two pointers method
        sort(arr);
        sort2(arr2);
        for(int item:arr2){
            System.out.print(item+" ");
        }
    }
}
