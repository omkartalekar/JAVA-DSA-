import java.util.*;


// We need to find two elements summing to given target.
// Sort the array
// Place 1st pointer(start) at 0 and 2nd pointer(end) at arr.length - 1
// Loop and add location to compare the sum with target
// Increment or decrement start or end accordingly
// Something like this:

// // start = 0, end = nums.length - 1
// // Note : nums is sorted
// 		while(start < end){ 
//                     if(target == nums[start]+nums[end]){
//                         return new int[2] {start, end};
						
//                     }else if(temp < nums[start]+nums[end]){
//                         end--;
//                     }
//                     else{
//                         start++;
//                     }
// Now for 4Sum
// What we do is create 2 level loop and then do the above code and change them according to the question:



// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
	
// 		// Sorting the array so we can use two pointer concept
//         Arrays.sort(nums);
//         List<List<Integer>> result = new ArrayList();
//         int n = nums.length;
		
// 		// 1st level loop, n-3 beacuse after i there should be another 3 elements 
// 		// to get into the result
//         for(int i=0; i<n-3; i++){
// 			//  checking if duplicate is present or not
//             if(i>0 && nums[i-1] == nums[i]) continue;
			
// 			// Same as outer loop
//             for(int j=i+1; j< n-2; j++){
// 				// Checking for duplicates
//                 if(j > i+1 && nums[j-1] == nums[j]) continue;
				
// 				// Defining variables for 2Sum type problem solution
//                 int start = j + 1;
//                 int end = n -1;
//                 int temp = target - nums[i] - nums[j];
// 				// Here temp becomes the temporary target
//                 while(start < end){
//                     // Check if equal
//                     if(temp == nums[start]+nums[end]){
// 						// Adding to the result
//                         result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
						
// 						//Checking if any duplicates present 
//                         while(start<end && nums[start] == nums[start+1]) start++;
//                         while(start<end && nums[end] == nums[end-1]) end--;
//                         start++;
//                         end--;
//                     }else if(temp < nums[start]+nums[end]){
//                         end--;
//                     }
//                     else{
//                         start++;
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }










class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
    
       Set<List<Integer> > set = new HashSet<>();
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-3; i++){
            for(int j=i+1; j<arr.length-2; j++){
                int left = j+1;
                int right = arr.length-1;
                
                while(left<right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    
                    if(sum==target) {
                        set.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;
                    }
                    
                    else if(sum<target) left++;
                    
                    else if(sum>target) right--;
                    
                }    
                    
            }
                               
            }
        
        return new ArrayList<>(set);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    // class Solution {
    //     public List<List<Integer>> fourSum(int[] nums, int target) {
    //         Arrays.sort(nums);
    //         return kSum(nums, target, 0, 4);
    //     }
        
    //     public List<List<Integer>> kSum(int[] nums, int target, int start, int k) {
    //         List<List<Integer>> res = new ArrayList<>();
    
    //         if (start == nums.length) {
    //             return res;
    //         }
            
    //         //the average value test that I was referring to
    //         int average_value = target / k;
            
    //         if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
    //             return res;
    //         }
            
    //         if (k == 2) {
    //             return twoSum(nums, target, start);
    //         }
        
    //         for (int i = start; i < nums.length; ++i) {
    //             if (i == start || nums[i - 1] != nums[i]) {
    //                 for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
    //                     res.add(new ArrayList<>(Arrays.asList(nums[i])));
    //                     List<Integer> sub = res.get(res.size() - 1);
    //                     sub.addAll(subset);
    //                     if (sub.get(0) > target / k || target / k > sub.get(sub.size() - 1)) //insert average value test here
    //                         return new ArrayList<>();
    //                 }
    //             }
    //         }
        
    //         return res;
    //     }
        
    //     public List<List<Integer>> twoSum(int[] nums, int target, int start) {
    //         List<List<Integer>> res = new ArrayList<>();
    //         int lo = start, hi = nums.length - 1;
        
    //         while (lo < hi) {
    //             int currSum = nums[lo] + nums[hi];
    //             if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
    //                 ++lo;
    //             } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
    //                 --hi;
    //             } else {
    //                 res.add(Arrays.asList(nums[lo++], nums[hi--]));
    //             }
    //         }
                                                              
    //         return res;
    //     }
    // }