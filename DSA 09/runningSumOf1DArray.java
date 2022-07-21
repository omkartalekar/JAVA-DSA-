class Solution {
    // public int[] runningSum(int[] nums) {

    // int n=nums.length;

    // for(int i=1;i<n;i++){
    // nums[i]=nums[i]+nums[i-1];
    // }

    // return nums;

    // }

    public static int[] completeSum(int arr[], int n) {
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j <= i; j++) {
                sum += arr[i];
            }
                res[i] = sum;
    }
        return res;
    }
}