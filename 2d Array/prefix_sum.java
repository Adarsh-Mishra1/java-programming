/*
 * Program to find the sum of elements of matrix between the give 
 * coordinates of (row1,col1) and (row2,col2)
 * 
 * Using Prefix Sum method we are storing the sum values in each cells in array_prefix_sum function
 * Inside the find_area_value_sum finding the sum by subtracting the last col-starting col of rectangle
 * 
 */
public class prefix_sum {
    
    public static void array_prefix_sum(int arr[][]){

        for(int i=0;i<arr.length;i++)
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
    }

    public static void find_area_value_sum(int arr[][],int row1,int col1,int row2,int col2){
        array_prefix_sum(arr);
        int sum=0;
        for(int i=row1;i<=row2;i++){
            
            if(col1>1){ //if the matrix is aligned at left then col1-1 can give negative therefore used if block
                sum+=arr[i][col2]-arr[i][col1-1];
            }else{
                sum+=arr[i][col2];
            }    
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr={
                    {1,2,3,4,5},
                    {6,5,4,3,2},
                    {8,2,7,4,2},
                    {1,2,3,5,5}
                    };
        //array_prefix_sum(arr);
        // Here Sending 7 4 2
        //              3 5 5
        find_area_value_sum(arr, 3, 0, 3, 4);
        //System.out.println(arr[0][4]);
        
       

    }
}
