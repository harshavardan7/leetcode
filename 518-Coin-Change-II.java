class Solution {
   public int change(int amount, int[] coins) {
       int[] dp = new int[amount+1] ;


       dp[0] = 1;
       for(int i = 0 ; i < coins.length ; i++){
           for(int j = 0 ; j < dp.length ; j++){
               if(j - coins[i] >= 0){
                   int ramt = j - coins[i] ;
                   dp[j] += dp[ramt] ;
               }
           }
       }
       return dp[amount] ;
   }

}