// Approach: This method is somewhat similar to Moore voting algorithm in terms of time complexity, but in this case, there is no need for the second step of Moore voting algorithm. But as usual, here space complexity becomes O(n). 

// In Hashmap(key-value pair), at value, maintain a count for each element(key) and whenever the count is greater than half of the array length, return that key(majority element). 


// HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
  
// for(int i = 0; i < arr.length; i++) {
//     if (map.containsKey(arr[i])) {
//             int count = map.get(arr[i]) +1;
//             if (count > arr.length /2) {
//                 System.out.println("Majority found :- " + arr[i]);
//                 return;
//             } else
//                 map.put(arr[i], count);

//     }
//     else
//         map.put(arr[i],1);
//     }
//     System.out.println(" No Majority element");
// }





// int n=nums.length;
//         int value=-1;
        
//         for(int i=0;i<n;i++){
//             int count=0;
//            value=nums[i];
//             for(int j=0;j<n;j++){
//                 if(nums[j]==value){
//                     count++;
//                 }
                
//             }
//             if(count>n/2){
//                     break;
//         }
//         }
//         return value;




// Sorting
// public int majorityElement1(int[] nums) {
//     Arrays.sort(nums);
//     return nums[nums.length/2];
// }


// Moore voting algorithm

// public int majorityElement3(int[] nums) {
//     int count=0, ret = 0;
//     for (int num: nums) {
//         if (count==0)
//             ret = num;
//         if (num!=ret)
//             count--;
//         else
//             count++;
//     }
//     return ret;
// }