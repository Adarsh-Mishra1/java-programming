package search;

public class find_square_root {
    static void square_root(int x){
        int start=0,end=x;
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            int value=mid*mid;
            if(value==x){
                ans=mid;
                break;
            }else{
                if(value>x) {
                    end=mid-1;
                }else{
                    ans=mid;
                    start=mid+1;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int x=25;
        square_root(x);

    }
}
