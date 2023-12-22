public class Sorting_Example4 {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sort(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<high){
            if(arr[mid]==1){
                //if we are getting 1
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
                //mid++;
            }
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,1,1,2,0,1,2,1};
        sort(arr);
        for(int item:arr){
            System.out.print(" "+item);
        }
    }
}
