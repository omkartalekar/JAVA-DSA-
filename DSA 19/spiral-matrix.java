// import java.util.*;

// public static class SpiralMatrix {
//     public List<Integer> spiralOrder(int[][] matrix) {
        
//         List<Integer> res = new ArrayList<Integer>();
        
//         if (matrix.length == 0) {
//             return res;
//         }
        
//         int rowBegin = 0;
//         int rowEnd = matrix.length-1;
//         int colBegin = 0;
//         int colEnd = matrix[0].length - 1;
        
//         while (rowBegin <= rowEnd && colBegin <= colEnd) {
//             // Traverse Right
//             for (int j = colBegin; j <= colEnd; j ++) {
//                 res.add(matrix[rowBegin][j]);
//             }
//             rowBegin++;
            
//             // Traverse Down
//             for (int j = rowBegin; j <= rowEnd; j ++) {
//                 res.add(matrix[j][colEnd]);
//             }
//             colEnd--;
            
//             if (rowBegin <= rowEnd) {
//                 // Traverse Left
//                 for (int j = colEnd; j >= colBegin; j --) {
//                     res.add(matrix[rowEnd][j]);
//                 }
//             }
//             rowEnd--;
            
//             if (colBegin <= colEnd) {
//                 // Traver Up
//                 for (int j = rowEnd; j >= rowBegin; j --) {
//                     res.add(matrix[j][colBegin]);
//                 }
//             }
//             colBegin ++;
//         }
        
//         return res;
//     }
// }





// USING RECURSION

// void recursiveSpiral(int X[][],int rowStart, int rowEnd, int colStart, int colEnd){


// if (rowStart > rowEnd || colStart > colEnd){
//     return
// } 

// for (int i = colStart; i <= colEnd; i = i + 1){
// print(X[rowStart][i]);
// }

// for (int i = rowStart + 1; i <= rowEnd; i = i + 1){
// print(X[i][colEnd]) 
// }


// if (rowEnd != rowStart){
// for (int i = colEnd-1; i > colStart; i = i-1){
// print(X[rowEnd][i])
//   }
// }



// if (colEnd = colStart){
// for (int i = rowEnd - 1; i >= rowStart + 1; i = i - 1){
// print(X[i][colStart])
// }
// }





// recursiveSpiral(X, rowStart + 1, rowEnd-1, colStart + 1, colEnd-1)



