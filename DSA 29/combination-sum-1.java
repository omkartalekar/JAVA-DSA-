// public List<List<Integer>> combinationSum(int[] nums, int target) {
//     List<List<Integer>> list = new ArrayList<>();
//     Arrays.sort(nums);
//     backtrack(list, new ArrayList<>(), nums, target, 0);
//     return list;
// }


// private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
//     if(remain < 0) return;
//     else if(remain == 0) list.add(new ArrayList<>(tempList));
//     else{ 
//         for(int i = start; i < nums.length; i++){
//             tempList.add(nums[i]);
//             backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
//             tempList.remove(tempList.size() - 1);
//         }
//     }
// }








// private void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
//     if (ind == arr.length) {
//         if (target == 0) {
//             ans.add(new ArrayList < > (ds));
//         }
//         return;
//     }

//     if (arr[ind] <= target) {
//         ds.add(arr[ind]);
//         findCombinations(ind, arr, target - arr[ind], ans, ds);
//         ds.remove(ds.size() - 1);
//     }
//     findCombinations(ind + 1, arr, target, ans, ds);
// }


// public List < List < Integer >> combinationSum(int[] candidates, int target) {
//     List < List < Integer >> ans = new ArrayList < > ();
//     findCombinations(0, candidates, target, ans, new ArrayList < > ());
//     return ans;
// }

