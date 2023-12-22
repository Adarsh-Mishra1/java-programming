import java.util.Arrays;
public class Sorting_Example {

    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                System.out.println("i="+i+" j="+j+" arr[j]="+arr[j]+" arr[j+1]="+arr[j+1]);
                if(arr[j]==0&&arr[j+1]!=0){
                    swap(arr,j,j+1);
                }
            }
            System.out.println();
        }
    }

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={0,5,0,3,4,2};
        //Program to sort
        //Shift all zeros to end but dont't change the oder of non zero elements
        // {5,3,4,2,0,0}
        sort(arr);
        for(int item:arr){
            System.out.print(item);
        }
    }
}
