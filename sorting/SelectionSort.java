public class SelectionSort {
    public static void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            //Outer Loop will take each element from left in 
            //every iteration and compare with rest of right element
            //if smaller found record the location and swap with current location
            //J will start after ith element because in right side each element is placed as sorted
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pos]>arr[j]){
                    pos=j;
                }
            }
            //We need a variable to store the found element location
            //Otherwise we will lost the location after the iteration
            temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;

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
