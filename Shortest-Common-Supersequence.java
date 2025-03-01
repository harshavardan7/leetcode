class Solution {
   public String lcs(String text1, String text2) {
       int[][] dp = new int[text1.length() +1] [text2.length()+1] ;
       for(int i = dp.length-2 ; i >= 0 ; i--){
           for(int j = dp[0].length-2 ; j >= 0 ; j--){


               if(text1.charAt(i) == text2.charAt(j)){
                   dp[i][j] = 1 + dp[i+1][j+1] ;
               }


               else{
                   dp[i][j] = Math.max(dp[i][j+1] , dp[i+1][j]) ;
               }
           }
       }

       StringBuilder lcs = new StringBuilder() ;
       int i = 0 , j = 0 ;
       while(i <text1.length()  && j < text2.length()){
           if(text1.charAt(i) == text2.charAt(j)){
               lcs.append(text1.charAt(i)) ;
               i++;
               j++ ;
           }
           else if(dp[i+1][j] > dp[i][j+1]){
               i++ ;
           }
           else{
               j++ ;
           }
       }
       return lcs.toString() ;
    }
   public String shortestCommonSupersequence(String str1, String str2) {
       String lcstr =  lcs(str1 , str2) ;
       int i = 0 , j = 0 , k = 0 ;
       StringBuilder ans = new StringBuilder() ;
       while(k < lcstr.length()){
           while(i < str1.length() && str1.charAt(i) != lcstr.charAt(k)){
               ans.append(str1.charAt(i)) ;
               i++ ;
           }
           while(j < str2.length() && str2.charAt(j) != lcstr.charAt(k)){
               ans.append(str2.charAt(j)) ;
               j++ ;
           }
           ans.append(lcstr.charAt(k)) ;
           i++;
           j++;
           k++;
       }
       while(i < str1.length()){
           ans.append(str1.charAt(i));
           i++ ;
       }


       while(j < str2.length()){
           ans.append(str2.charAt(j));
           j++ ;
       }
       return ans.toString() ;
   }
}

