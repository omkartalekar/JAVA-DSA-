
class Solution {
    //     public List<List<Integer>> threeSum(int[] nums) {
            
    //         List<List<Integer>> res=new ArrayList<>();
    //         Arrays.sort(nums);
            
    //         int n=nums.length;
            
    //         for(int i=0;i<n-2;i++){ 
                
    //             if(i==0 || nums[i] != nums[i-1]){
    //                 for(int j=i+1;j<n-1;j++){
       
    //                 for(int k=j+1;k<n;k++){
                 
    //                     if(nums[i]+nums[j]+nums[k]==0){
    //                         List<Integer> slist=new ArrayList<>();
    //                             slist.add(nums[i]);
    //                             slist.add(nums[j]);
    //                             slist.add(nums[k]);
    //                         res.add(slist);
    //                     }
    //                 }
    //             }
    //         }
                
    //         }
    //         return res;
    //     }
    // }
    













    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length-2; i++) {
            
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        
                        lo++; hi--;
                        
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    
                    else hi--;
               }
            }
        }
        return res;
    }
    }
    
    
    
       
    



















    
    //       public List<List<Integer>> threeSum(int[] nums) {
    //         Set<List<Integer>> set = new HashSet<>();
    //         if(nums.length == 0) return new ArrayList<>(set);
    //         Arrays.sort(nums);
    //         for(int i=0; i< nums.length-2; i++){
    //             int j = i+1;     //j starts at i+1
    //             int k= nums.length-1;  //k starts at the end
    //             while(j<k){
    //                 int sum = nums[i]+nums[j]+nums[k];
    //                 if(sum == 0)
    //                     set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
    //                  else if(sum > 0)
    //                     k--;    
    //                  else if(sum <0)
    //                     j++;
    //             }
    //         }
    //         return new ArrayList<>(set);
    //   }
    // }