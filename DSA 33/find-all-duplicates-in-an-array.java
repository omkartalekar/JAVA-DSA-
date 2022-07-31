import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> list=new ArrayList<>();
//         int n=nums.length;
        
//         Arrays.sort(nums);
        
//         for(int i=1;i<n;i++){ 
//             if(nums[i]==nums[i-1]){
//                list.add(nums[i]);
//             }
//         }
        
//         return list;
        
        
        
//         List<Integer> list=new ArrayList<>();
//         int n=nums.length;
        
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
        
//         for(Integer key:map.keySet()){
//             if(map.get(key)>1){
//                 list.add(key);
//             }
//         }
//         return list;
        
        
//          List<Integer> list=new ArrayList<>();
//          int n=nums.length;
        
//         Set<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++){
//             if(!set.add(nums[i])){
//                 list.add(nums[i]);
//             }
//         }
//         return list;
        
        
        
//          List<Integer> list=new ArrayList<>();
//          int n=nums.length;
        
//          int freq[]=new int[n+1];
        
//         for(int i=0;i<n;i++){
//             freq[nums[i]]++;
//         }
        
//         for(int i=0;i<n+1;i++){
//             if(freq[i] > 1){
//                 list.add(i);
//             }
//         }
//         return list;
        
        
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            int idx=Math.abs(nums[i])-1;
            
            
            if(nums[idx]< 0){
                list.add(idx+1);
            }
            nums[idx]*=-1;
            
        }
        
           return list;
    }
}