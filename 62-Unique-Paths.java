class Solution {
    public int uniquePaths(int m, int n) {
        // tabulation 
        int[][] dp = new int[m][n] ;
        for(int i = dp.length-1 ; i >= 0  ; i--){
           for( int j = dp[0].length-1 ; j >=0   ; j--){
             if (i == m-1 && j == n-1){ // destination
                  dp[i][j] = 1 ; 
                  }
             else if(i == m-1 || j == n-1){
                dp[i][j] = 1 ;
            }
           
                  else{
                    dp[i][j] = dp[i+1][j] + dp[i][j+1] ;  
                  }
           }
        }
    return dp[0][0] ; 

        // int[][]grid = new int[m][n] ; 
        // int[][] memo = new int[m][n] ;
        // for(int i = 0 ; i < memo.length ; i++){
        //     for(int j = 0 ; j < memo[0].length ; j++){
        //         memo[i][j] = -1; 
        //     }
        // } 
        // return uniquiPathrec(0,0,grid , memo) ; 
    }

    // public int uniquiPathrec(int sr , int sc , int[][]grid , int[][]memo){
    //     if(sr == grid.length-1 && sc == grid[0].length-1)
    //     {
    //         memo[sr][sc] = 1; 
    //         return 1 ;
    //     }
         
    //     if(sr <0 || sc < 0 || sr >= grid.length || sc >= grid[0].length) {
    //         return 0 ; 
    //     }
    //     if(memo[sr][sc] != -1) return memo[sr][sc] ; 
    //     int I1 = uniquiPathrec(sr , sc + 1 , grid , memo) ; // horizal path
    //     int I2 = uniquiPathrec(sr+1 , sc , grid , memo) ; //vertical path 
    //     memo[sr][sc] = I1 + I2 ; 
    //     return I1 + I2 ; 
    // }
}

