import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {

        // Approach 1 ; O(N^2)

        // if (nums == null || nums.length < 2) {
        // return null;
        // }

        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }
        // return new int[] {};

        // Approach 2 ; O(N)

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if (map.containsKey(rem)) {
                return new int[] { map.get(rem), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int target = 5;
        // int n=arr.length;

        int ans[] = twoSum(arr, 5);
        System.out.println(Arrays.toString(ans));
        // System.out.println(Arrays.toString(
        // twoSum(new int[]{3, 6, 10, 14}, 9)));

    }

}

// Approach using HashMap applicable for all condition

// import java.util.ArrayList;
// import java.util.HashMap;

// public class Solution {
// 	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		
//         HashMap<Integer,Integer> map=new HashMap<>();
        
//         for(int i=0;i<n;i++){
//             if(map.containsKey(arr.get(i))){
//                 map.put(arr.get(i),map.get(arr.get(i))+1);
//             }
//             else{
//                 map.put(arr.get(i),1);
//             }
//         }
        
//         ArrayList<Pair<Integer,Integer>> ans=new ArrayList<>();
        
//         for(int i=0;i<n;i++){
//             int rem=target-arr.get(i);
            
//             if(arr.get(i)==rem){
//                 if(map.get(arr.get(i))>1){
//                     ans.add(new Pair(arr.get(i),arr.get(i)));
                    
//                     map.put(arr.get(i),map.get(arr.get(i))-2);
//                 }
//             }
//             else{
//                 if(map.containsKey(rem) && map.get(arr.get(i))>0  &&  map.get(rem)>0){
//                     ans.add(new Pair(arr.get(i),rem));
//                     map.put(arr.get(i),map.get(arr.get(i))-1);;
//                     map.put(rem,map.get(rem)-1);
//                 }
//             }
//         }
        
//         if(ans.size()==0){
//            ans.add(new Pair(-1,-1));
//         }
           
//         return ans;
        
// 	}
// }
