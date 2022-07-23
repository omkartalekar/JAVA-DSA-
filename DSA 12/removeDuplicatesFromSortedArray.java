class Solution {
    public int removeDuplicates(int[] nums,int n) {
        
        // approach 1
        
//        int n=nums.length;
       
//         Set<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++){
//             set.add(nums[i]);
//         }
//         int k=set.size();
//         int j=0;
        
//         for(int val:set){
//             nums[j++]=val;
//         }
//         return k;
        
        

        
        // best approach
        
        // int n=nums.length;
        
        // int j=1;
        
        // for(int i=1;i<n;i++){
        //     if(nums[i-1]==nums[i]){
        //             continue;   
        //        }
        //         else{
        //             nums[j++]=nums[i];
        //         }
        //    }
            
        //     return j;





   
        // Return, if array is empty or contains a single
        // element
        if (n == 0 || n == 1)
            return n;
 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next
            // element then store that current element
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
 
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = nums[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];
 
        return j;
    }
        
        
    }
