// class Solution {
//     public int[] productExceptSelf(int[] nums) {
        

//         int n = nums.length;
//         int ans[] = new int[n];
        
//         for(int i = 0; i < n; i++) {
//             int pro = 1;
//             for(int j = 0; j < n; j++) {
//                 if(i == j) continue;
//                 pro *= nums[j];
//             }
//             ans[i] = pro;
//         }
        
//         return ans;

        
        
        



        
        
//         int n=nums.length;
//         int product=1;
        
//        int startSum[]=new int[n];
//        int endSum []=new int[n];
        
        
//         for(int i=0;i<n;i++){
//             if(i!=0){
//                 startSum[i]=startSum[i-1]*nums[i];
//             }
//             else{
//                 startSum[i]=nums[i];
//             }
//         }
        
//         for(int i=n-1;i>=0;i--){
//             if(i!=n-1){
//                 endSum[i]=endSum[i+1]*nums[i];
//             }
//             else{
//                 endSum[i]=nums[i];
//             }
//         }
        
        
//         for(int i=0;i<n;i++){
//             if(i==0){
//                 nums[i]=endSum[i+1];
//             }
//             else if(i==n-1){
//                 nums[i]=startSum[i-1];
//             }
//             else{
//                 nums[i]=startSum[i-1]*endSum[i+1];
//             }
//         }
        
//         return nums;
        







        
//          int n = nums.length;
//         int countZeroes = 0;
//         int indexZero = -1;
//         int productWithoutZero = 1;
        
//         for(int i = 0 ; i < n ; i++) {
//             if(nums[i] == 0) {
//                 countZeroes++;
//                 indexZero = i;
//             }
//             else {
//                 productWithoutZero *= nums[i];
//             }
//         }
        
//         int [] output = new int [n];
//         if(countZeroes == 0) {
//             for(int i = 0 ; i < n ; i++) {
//                 output[i] = productWithoutZero / nums[i];
//             }
//         }
//         else if(countZeroes == 1) {
//             output[indexZero] = productWithoutZero;
//         }
//         return output;
//     }
// }





// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int ans[] = new int[n];
//         Arrays.fill(ans, 1);
//         int curr = 1;
//         for(int i = 0; i < n; i++) {
//             ans[i] *= curr;
//             curr *= nums[i];
//         }
//         curr = 1;
//         for(int i = n - 1; i >= 0; i--) {
//             ans[i] *= curr;
//             curr *= nums[i];
//         }
//         return ans;
//     }
// }