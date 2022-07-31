class Solution {
    public int findDuplicate(int[] nums) {
        
         // Using 2 For Loops
        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
        
        
         // Using Sorting
        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //        return nums[i];
        //     }
        // }
        // return 0;
        
        
        
         // Using HashMap
//         int n=nums.length;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int ans=-1;
        
//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
        
//         for(int i=0;i<n;i++){
//             if(map.get(nums[i])>1){
//                 return nums[i];
//             }
//         }  
//          return 0;
        
        
        
        
        
        // int n=nums.length;
        // int freq[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     if (freq[nums[i]] == 0) {
        //         freq[nums[i]]++;;
        //     } else {
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        
//         Using HashSet
//         int n=nums.length;
//         Set<Integer> set=new HashSet<>();
        
//         for(int i=0;i<n;i++){
//             if(!set.add(nums[i])){
//                 return nums[i];
//             }
//         }
//         return 0;
        
        
         // Using Frequency Array
//         int n=nums.length;
//         int freq[] = new int[n];
//         for (int i = 0; i < n; i++) {
//               freq[nums[i]]++;
            
//             if (freq[nums[i]] > 1) {
//                  return nums[i];
//             }
          
//         }
//         return 0;
        
        
        
        
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    }

