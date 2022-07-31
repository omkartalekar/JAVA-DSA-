class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        
        int total = 0;
        for (int i = 0; i < k; i++) total += nums[i];
        
         if (k == nums.length) {
            return total;
         }
             
        int best = total;
         int j = n - 1; 
        
        for (int i = k - 1;i >= 0; i--) {
            total += nums[j] - nums[i];
            best = Math.max(best, total);
            j--;
        }
        return best;
        
       
    }
}
