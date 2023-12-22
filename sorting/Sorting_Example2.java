//Problem : In a sorted array two elements are in wrong place just find and
//place them in right position
public class Sorting_Example2
{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr) {
        int size = arr.length - 1;
        int x = -1;
        int y=-1;
        for (int i = 1; i < size; i++) {
            if (arr[i-1] > arr[i]) {
                if(x==-1){
                    x=i-1;
                }else{
                    y=i;
                }
            }

        }

        swap(arr,x,y);
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,16,7,8,14,6,15};
        sort(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
}
