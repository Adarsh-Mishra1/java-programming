package Array;
import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                temp[res] = nums[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            nums[i] = temp[i];
        }
        for(int i = 0; i < res; i++){
            System.out.println(nums[i]);
        }
        return res;
    }

    public static void freq(int arr[]) {
        int i;
        int N = arr.length;
        HashMap<Integer, Integer> map = new HashMap(N);
        for (i = 0; i < N; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        for (i = 1; i <= N; i++) {
            if (map.containsKey(i)) {
                arr[i - 1] = map.get(i);
            }else{
                arr[i - 1] = 0;
            }
        }
    }

    public static void triplet() {
        HashSet<Integer> st = new HashSet<>();
        int[] arr = {3, 2, 4, 6, 5};
        int a = 3, b = 4, c = 0;
        int[] sq = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            sq[i] = sq[i] * sq[i];
        }
        Arrays.sort(sq);
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (l >= r) {
                System.out.println("Not found");
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 5, 6, 6, 7};
        removeDuplicates(arr);
    }
}
