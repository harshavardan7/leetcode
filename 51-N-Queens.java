class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        boolean[][] grid = new boolean[n][n] ; 
        List<List<String>> solutions = new ArrayList<>() ; 
        solve(grid , 0, solutions) ;
        return solutions ;
    }

    public void solve (boolean[][] grid , int row ,List<List<String>> solutions ){
        if(row == grid.length){
            solutions.add(display(grid)) ;
            return ; 
        }
        for(int col = 0  ; col < grid.length ; col++){
            if(isSafe(grid , row, col)){
                grid[row][col] = true ; 
                solve(grid , row+1, solutions) ; 
                grid[row][col] = false ;
            }
        }
    }

    public List<String> display(boolean[][] grid){
        ArrayList<String> list = new ArrayList<>() ; 
        for(boolean[] r : grid) {
            StringBuilder str = new StringBuilder() ; 
            for(boolean val : r){
                if(val){
                    str.append("Q") ;
                }
                else{
                    str.append(".") ;
                }
            }
             list.add(str.toString()) ;
        }
        return list ; 
    }

    public boolean isSafe(boolean[][]board , int row , int col){
        for(int i = row-1 ; i >= 0 ; i--){
            if(board[i][col]  == true) return false ;
        }

        for(int i = row-1 , j = col+1 ; i>= 0 && j <board.length ; i-- , j++){
             if(board[i][j]  == true) return false ;
        }

        for(int i = row - 1 , j= col-1 ; i >= 0 && j >= 0  ; i-- , j--){
            if(board[i][j]  == true) return false ;
        }
        return true ;
    }
}