class Solution {
    public void rotate(int[][] matrix) {
        // if(matrix==null || matrix.length<1){
        //     return null;
        // }
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        int i=0; int j=m-1;
        while(i<j){
            for(int k=0;k<n;k++){
                int temp=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=temp;
            }
            i++;
            j--;
        }
    
    }   
}


// int n = matrix.length;
// int m=matrix[0].length;
//         int rotated[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 rotated[j][n - i - 1] = matrix[i][j];
//             }
//         }
        

