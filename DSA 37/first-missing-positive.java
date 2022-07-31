
import java.util.*;

class Solution {
    
    // Searching
        
    // Since we are given an integer ‘N’, there could be a maximum of ‘N’ positive integers in the array.
    // The minimum positive number is 1, hence we can search from 1 to N in the array.
    // Run a loop from 1 to N, and search for each element in the array.
    // If the element is present in the array then search for the next element.
    // If it is not present then, the element is the answer.
    // Otherwise, if all the elements between 1 to N are present in the array then the minimum positive integer that is missing would be N+1. So the answer would be N+1.
        
    //     public int firstMissingPositive(int[] nums) {
    //         int n=nums.length;
            
    //         for(int i=1;i<=n;i++){
    //             boolean res=searchMissing(nums,i,n);
    //             if(res==false){
    //                 return i;
    //             }
    //         }
    //         return n+1;
    //     }
        
    //     public boolean searchMissing(int [] nums,int val,int n){
    //         for(int i=0;i<n;i++){
    //             if(nums[i]==val){
    //                 return true;
    //             }
    //         }
            // return false;
            
        
        
        
    // Sorting
        
    // Sort the array.
    // Initialize a variable counter with 1, that will keep track of the positive integers that are present in the array.
    // Traverse the whole array and if the current element is negative or zero then skip the element.
    // If the current element is positive and equal to the counter, then increment the counter.
    // If the current element is not equal to the counter then return the counter, because the counter will be the smallest positive missing element.
    // If the whole array is traversed then return N+1.
        
        
        public static int firstMissingPositive(int[] nums) {
            int n=nums.length;
            
            if (n == 0) {
                return 1;
            }
    
            Arrays.sort(nums);
            int counter = 1;
    
            for (int i = 0; i < n; i++) {
                if (nums[i] == counter) {
                    counter++;
                }
    
                // Skip the negative number.
                if (nums[i] < counter) {
                    continue;
                }
                // First missing positive number.
                else {
                    break;
                }
            }
    
            return counter;
        }
            
        
        
    // Store the elements
        
    // With the help of extra space, we can mark all the positive elements present in the array.
    // Traverse the array and store all the positive elements between 0 to N+1 of the array in the visited array.
    // ARR[i] will be stored at VIS[ARR[i]].
    // After storing all the positive elements in the visited array, run a loop from 1 to N+1 and check which smallest element is not present in the visited array.
    // Return the element that is missing from the visited array.
        
        
    //         int n=nums.length;
    //         boolean []visited=new boolean[n+1];
            
    //         for(int i=0;i<n;i++){
    //             if(nums[i]>=1 && nums[i]<=n){
    //                  visited[nums[i]]=true;
    //             } 
    //         }
            
    //         for(int i=1;i<=n;i++){
    //             if(visited[i]==false){
    //                 return i;
    //             }
    //         }
    //         return n+1;
    //     }
    // }
    
    
        
    // Segregation
        
    // Call a function that will segregate the positive integer to the negative integers i.e move all non-positive elements to the right side, and return the index at which non-positive integers START.
    // Now we can ignore non-positive elements and consider only the part of the array which contains all positive elements. We traverse the array containing all positive numbers. To mark the presence of an element ARR[i], we change the sign of value at index ARR[i] to negative i.e mark the presence of element 1 by making the element of array at index 1 to negative, given that the index lies in that segment of positive elements.
    // To find the smallest positive missing element, we traverse the positive elements array again and print the first index which has positive value. In case all e
        
        
    
    //  public int firstMissingPositive(int[] nums) {
    //         int i = 0;
    //         int j;
    //         int n = nums.length;
            
    //         // handle case of a single-element array
    //         if (n == 1) {
    //             if (nums[i] == 1) return 2;
    //             else return 1;
    //         }
            
    //         // try to place numbers in their correct indices
    //         while (i < n) {  
    //             // ignore numbers out of range (negative numbers and numbers greater than length of the array)
    //             if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
    //                 swap(nums, i, nums[i] - 1);
    //             } else {
    //                 i++;
    //             }
    //         }
            
    //         // loop through the array again
    //         // find the first number that is not at its correct index
    //         for (i = 0; i < n; i++) {
    //             if (nums[i] != i + 1) {
    //                 return i + 1;
    //             }
    //         }
            
    //         return nums.length + 1;
    //     }
        
    //     private void swap(int[] nums, int i, int j) {
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //     }
    }