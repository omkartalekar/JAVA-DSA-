import java.util.*;

class PivotIndex {
    public static int pivotIndex(int nums[],int n){

        // Use two loops. Outer loop iterates through all the element and inner loop finds out whether the current index picked by the outer loop is equilibrium index or not. Time complexity of this solution is O(n^2). 


    //     int i, j;
    //     int leftsum, rightsum;
  
    //     /* Check for indexes one by one until 
    //        an equilibrium index is found */
    //     for (i = 0; i < n; ++i) {
  
    //         /* get left sum */
    //         leftsum = 0;  
    //         for (j = 0; j < i; j++)
    //             leftsum += arr[j];
  
    //         /* get right sum */
    //         rightsum = 0;
    //         for (j = i + 1; j < n; j++)
    //             rightsum += arr[j];
  
    //         /* if leftsum and rightsum are same, 
    //            then we are done */
    //         if (leftsum == rightsum)
    //             return i;
    //     }

    //     return -1;


    // }







    // int n=nums.length;
       int leftSum=0;
       int rightSum=0;
       
       int mid=n/2;
       
       for (int i = 0; i < mid; i++)
    {
        leftSum += nums[i];
    }
   
    System.out.println(leftSum);
       
    //calculating sum to right of mid
    for (int j = mid+1; j < n; j++)
    {
        rightSum += nums[j];
    }

    System.out.println(rightSum);
    // System.out.println(mid);
       
       if(rightSum>leftSum){

        while(rightSum>leftSum && mid < n-1){
            rightSum-=mid+1;
            leftSum+=mid;
            mid++;
            
        } 
       }
       
       else {
        while(leftSum > rightSum && mid > 0){
            leftSum-=nums[mid-1];
            rightSum+=nums[mid];
            mid--;
        }   
       }
       
       if(rightSum==leftSum){
           return mid;
       }
       
       return -1;
       
       

    }


    public static void main(String[] args)
    {
        
        int arr[] = {-1,-1,-1,-1,-1,0 };
        int arr_size = arr.length;
        System.out.println(pivotIndex(arr, arr_size));
    }
}
