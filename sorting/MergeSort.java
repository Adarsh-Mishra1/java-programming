public class MergeSort
{
    static void  sort(int[] arr,int l,int mid,int r){
        System.out.println(l+" "+" "+r);
        int n1=mid-l+1;
        /*
        If you calculate the number of elements in the left subarray using mid - l,
        it doesn't include the element at the mid index. However, we want to include that element,
        so we add 1 to the calculation, resulting in int n1 = mid - l + 1;.
        */
         
        int n2=r-mid;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        int k=l;
        for(int i=0;i<n1;i++){
            arr1[i]=arr[k];
            k++;
        }
        k=mid+1;
        for(int i=0;i<n2;i++){
            arr2[i]=arr[k];
            k++;
        }
        int i=0,j=0;
        k=l;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++]=arr2[j++];
            }
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    static void mergesort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;

        mergesort(arr,l,mid);
        //System.out.println(arr[l]+" "+arr[r]);
        mergesort(arr,mid+1,r);
        sort(arr,l,mid,r);
    }
    static void display(int[] arr){
        for(int item:arr){
            System.out.print(item);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,4,5,3,8,1};
        System.out.println("Before Sort:");
        display(arr);
        System.out.println("\n After Sort");
        mergesort(arr,0,arr.length-1);
        display(arr);
    }
}
