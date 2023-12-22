public class Mergesort {
    public static void merge(int l,int mid,int r,int[] arr){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] a1=new int[n1];
        int[] a2=new int[n2];
         int k=l;
        for(int i=0;i<n1;i++){
            a1[i]=arr[k];
            k++;
        }
        for(int i=0;i<n2;i++){
            a2[i]=arr[k];
            k++;
        }
        int i=0,j=0;
        k=l;
        while(i<n1&&j<n2){
            if(a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
            }else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int l,int r,int[] arr){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergesort(l,mid,arr);
        mergesort(mid+1,r,arr);
        merge(l,mid,r,arr);
    }
    public static void main(String[] args) {
        int[] arr={2,6,3,7};
        mergesort(0,arr.length-1,arr);
        for(int n:arr){
            System.out.print(n);
        }
    }
}
