// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int max = 0;
//         while(left < right){
//             int w = right - left;
//             int h = Math.min(height[left], height[right]);
//             int area = h * w;
//             max = Math.max(max, area);
//             if(height[left] < height[right]) left++;
//             else if(height[left] > height[right]) right--;
//             else {
//                 left++;
//                 right--;
//             }
//         }
//         return max;
//     }
// }


// public static int maxArea_bf(int[] height) {
//     int len = height.length;
//     int max = 0;
//     for (int i = 0; i < len - 1; i++) {
//         for (int j = i + 1; j < len; j++) {
//             int area = Math.min(height[i], height[j]) * (j - i);
//             max = Math.max(max, area);
//         }
//     }

//     return max;
// }