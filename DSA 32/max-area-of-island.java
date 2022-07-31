class Solution {

    static int count;
    
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count=0;
                    helper(i,j,grid);
                    ans=Math.max(count,ans);
                }
                
            }
        }
        return ans;
    }
    
    public static void helper(int i,int j,int grid[][]){
        
        
        if(i<0 ||j<0 ||  i>=grid.length  || j>=grid[0].length || grid[i][j]==0){
            return;
        }
        
             grid[i][j]=0;
             count++;
            
        
            helper(i-1,j,grid);
            helper(i+1,j,grid);
            helper(i,j-1,grid);
            helper(i,j+1,grid);
             
    }
}
