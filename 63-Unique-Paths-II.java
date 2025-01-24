class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length] ; 
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = -1 ; 
            }
        }
        return helper(grid , 0 , 0 ,dp ) ; 
    }

    public int helper(int[][] grid , int row , int col , int[][]dp){
        if(row >= grid.length || col >= grid[0].length || grid[row][col] == 1 ){
            return 0 ; 
        } 
        if(row == grid.length-1 && col == grid[0].length-1){
            dp[row][col] = 1 ; 
            return 1 ;
        } 
        if(dp[row][col] != -1) return dp[row][col] ;  
        int rightCall = helper(grid , row , col+1 , dp) ;
        int downCall = helper(grid, row+1 , col , dp) ;
        dp[row][col] = rightCall + downCall ; 
        return rightCall + downCall ;
    }
}

