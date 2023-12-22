public class gfg_potd
{
    static void shuffleArray(long arr[], int n)
    {
        int start = 0, end = n/2, mod = 1001;
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
                arr[i] = (arr[start++] % mod) * mod + arr[i];
            else
                arr[i] = (arr[end++] % mod) * mod + arr[i];
        }

        for(int i = 0; i < n; i++)
            arr[i] = arr[i]/mod;
    }
    public static void pascal_triangle() {
        int[] arr=new int[4];
        int n = 4;
        int num = 0;
        int i;
        for (i = 0; i < 4; i++)
            num = fact(4) / fact(i) * fact(4 - i);
            arr[i] = num;
        }

    public static int fact(int x){
        if(x==1){
            return 1;
        }
        return x*fact(x-1);
    }

    public static int posOfRightMostDiffBit(int m, int n)
    {
        int xor = m^n;
        String s = Integer.toBinaryString(xor);
        int ans = 0;
        for(int i=s.length()-1; i>=0; i--){
            ans++;
            if(s.charAt(i)=='1') {
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res=2^3;

        System.out.println(res);
        long[] arr={1,2,3,4,5,6};
        int n=6;
        //shuffleArray(arr,n);
    }
}
