
public class Quicksort {
    public static void swap(int[] arr,int x,int y){
        int temp=arr[y];
        arr[y]=arr[x];
        arr[x]=temp;
    }
    public static int partition(int l,int r,int[] arr){
        //i am considering last element as pivot
        int pivot=arr[r];
        int counter=l-1;
        for(int i=l;i<=r;i++){
            if(arr[i]<pivot){
                counter++;
                swap(arr,i,counter);
            }
        }
        swap(arr,counter+1,r);
        return counter+1;
    }
    public static void QuickSort(int l,int r,int[] arr){
            if(l>=r) return;
            int pivot=partition(l,r,arr);
            QuickSort(l,pivot-1,arr);
            QuickSort(pivot+1,r,arr);
    }
    public static void main(String[] args) {
        int[] arr={8,7,4,2,7,4,0};
        QuickSort(0,arr.length-1,arr);
        for(int n:arr){
            System.out.print(n);
        }


    }
}