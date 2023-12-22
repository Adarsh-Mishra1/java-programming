package search;

public class Binary_Search {
    static int using_recursion(int[] arr,int target,int start,int end){
        int mid=(start+end)/2;
        if(start>end) return -1;
        if(arr[mid]==target) {
            return mid;
        }else {
            if (target < arr[mid]) {
                return using_recursion(arr,target, start, mid - 1);
            }else{
                return using_recursion(arr,target,mid + 1,end);
            }
        }
    }
    static int using_without_recursion(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else{
                if(target<arr[mid]){
                    //if lies in left part
                    end=mid-1;
                }else{
                    //if element lies in right part
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8};
        int target=1;
        //Binary Search needed order or already sorted array
        //System.out.printf("Element %d is found at index %d",target,using_recursion(arr,3,0,arr.length-1));
        /*
        int res=using_without_recursion(arr,target);
        if(res!=-1){
            System.out.printf("Element %d is found at index: %d",target,res);
        }else{
            System.out.println("Not found");
        }
        */
        if(using_recursion(arr,target,0,arr.length-1)!=-1){
            System.out.println("Element is found");
        }else{
            System.out.println("Not found");
        }
        //System.out.print(using_without_recursion(arr,3));
    }
}
