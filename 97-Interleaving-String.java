class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
        if(s1.length() + s2.length() == s3.length()) 
		    return solve(s1, s2, s3, 0, 0, 0, dp);
        return false;
    }

    private boolean solve(String s1, String s2, String s3, int i, int j, int k, Boolean[][] dp) {
        if(k >= s3.length()) return true;
        if(dp[i][j] != null) return dp[i][j];
        boolean considerS1 = false, considerS2 = false;
        if(i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            considerS1 = solve(s1, s2, s3, i+1, j, k+1, dp);
        }
        if(j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            considerS2 = solve(s1, s2, s3, i, j+1, k+1, dp);
        }
        dp[i][j] = considerS1 || considerS2;
        return dp[i][j];
    }
}