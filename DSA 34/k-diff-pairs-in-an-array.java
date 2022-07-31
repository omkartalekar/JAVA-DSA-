import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
       // using hashMap
       
//  			Map<Integer, Integer> map = new HashMap();
//  			for (int num : nums)
//  				map.put(num, map.getOrDefault(num, 0) + 1);

//  			int result = 0;
//  			for (int i : map.keySet())
//  				if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
//  					result++;
//  			return result;
       
       
       
//             sorting 
       
       // int result=0;
       // Arrays.sort(nums);
       // for(int i=0;i<nums.length-1;i++){
       //     if(i!=0 && nums[i]==nums[i-1])continue;
       //     for(int j=i+1;j<nums.length;j++){
       //         if(j!=i+1 && nums[j]==nums[j-1])continue;
       //         if(nums[i]-nums[j]==k || nums[j]-nums[i]==k){
       //             result++;
       //         }
       //     }
       // }
       // return result;

       
       
       // binary search+ two pointers
   Arrays.sort(nums);
   int count=0;
   for(int i=0;i<nums.length;i++)
   {  
           if(i!=0 && nums[i]==nums[i-1]){
           continue;
       }
       int low=i+1;
       int high=nums.length-1;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           if(nums[mid]-nums[i]==k)
           {count++;
            break;
           }else if(nums[mid]-nums[i]>k)
               high=mid-1;
           else
               low=mid+1;
       }

   }
   return count;
}
}
