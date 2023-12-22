package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void twosum(int[] arr,int idx) {
        int target = 12;
        int index = 0;

        System.out.println(idx);
        int[] res = new int[1];
        for (int i = 0; i < idx; i++) {
            for (int j = i + 1; j <=idx; j++) {
                if ((arr[i] + arr[j]) == target) {
                    res = new int[]{i, j};

                }

            }
        }
        for (int result : res) {
            System.out.print(result + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,9,8};
        int target=12;
        Arrays.sort(arr);

        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                idx=i;
            }
        }
        twosum(arr,idx);
        for(int item:arr){
            System.out.print(item+" ");
        }
        //System.out.println("\n"+idx);
    }
}
