public class First_Occurance
{
    static int find_first_occur(int[] arr,int target){
        int start=0,end=arr.length-1,mid=0;
        int loc=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                loc=mid;
                end=mid-1;
            }
            if(target>arr[mid]){
                    start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return loc;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,5,5,6,7};
        int target=3;
        int res=find_first_occur(arr,target);
        System.out.println(res);
    }
}
