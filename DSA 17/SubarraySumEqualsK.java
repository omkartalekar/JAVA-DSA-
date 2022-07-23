import java.util.*;

class Solution {
    public int subarraySum(int[] arr, int k) {
        
        
        
//         int count = 0;
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             int sum = 0;
//             for(int j=i; j<n; j++){
//                 sum+=arr[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
        
//         return count;
        




        
        int n=arr.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}