class Solution {
    public void nextPermutation(int[] nums) {
          // Two Pointers time: O(n) space: O(1)
        if (nums == null || nums.length <= 1) {
            return;
        }

        int len = nums.length;
        int left = len - 2;
        /**
         * from right to left, search for the first one which is smaller than the right digit.
         */
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        /**
         *  If the one exists, search a one which is larger than it from right to left.
         */
        if (left >= 0) {
            int right = nums.length - 1;
            while (right >= 0 && nums[left] >= nums[right]) {
                right--;
            }
            /**
             * swap them.
             */
            swap(nums, left, right);
        }

        /**
         *  flip the right to make the number smaller.
         */
        reverse(nums, left + 1);
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int[] nums, int low) {
        int left = low;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    
}