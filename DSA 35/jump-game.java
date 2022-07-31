class Solution {
    public boolean canJump(int[] nums) {
//         int n=nums.length;
        
//         int maxReach=0;
        
//         for(int i=0;i<n;i++){
            
//             if (i > maxReach) return false;
            
//             maxReach=Math.max(maxReach,i+nums[i]);
//         }
        
//         return true;
        
        
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] < i){
                return false;
            }
            dp[i] = Math.max(dp[i - 1], i + nums[i]);
        }
        return true;
    }
}