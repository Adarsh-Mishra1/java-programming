public class InsertionSort {
    public static void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){  
            int cur_pos=i;
            while(cur_pos>0&&arr[cur_pos]<arr[cur_pos-1]){
                temp=arr[cur_pos];
                arr[cur_pos]=arr[cur_pos-1];
                arr[cur_pos-1]=temp;
                cur_pos--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={9,7,8,6,5};
        sort(arr);

        //Printing the Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
