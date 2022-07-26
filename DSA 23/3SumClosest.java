// import java.util.*;

// public class Solution {
//     public int threeSumClosest(int[] num, int target) {
//         int result = num[0] + num[1] + num[num.length - 1];
//         Arrays.sort(num);
//         for (int i = 0; i < num.length - 2; i++) {
//             int start = i + 1, end = num.length - 1;
//             while (start < end) {
//                 int sum = num[i] + num[start] + num[end];
//                 if (sum > target) {
//                     end--;
//                 } else {
//                     start++;
//                 }
//                 if (Math.abs(sum - target) < Math.abs(result - target)) {
//                     result = sum;
//                 }
//             }
//         }
//         return result;
        
        
//             }
// }
        
       



        
        
        
//         int closestSum=Integer.MAX_VALUE;
//         int totalSum=0;
        
//         for (int i = 0; i < num.length-2 ; i++)
// {
//     for(int j =i + 1; j < num.length-1; j++)
//     {
//         for(int k =j + 1; k < num.length; k++)
//         {
            
//             totalSum=num[i] + num[j] + num[k];
//             //update the closestSum
//             if(Math.abs(target - closestSum) > Math.abs(target - totalSum)){
//                 closestSum = totalSum;
                
//                 totalSum=0;
//            }
            
//         }
//     }
// }

// return closestSum;
//     }
// }
