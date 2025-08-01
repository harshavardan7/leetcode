class Solution {
    public int hammingWeight(int n) {
        int s=0;
        while(n>0){
            int b=n&1;
            if(b==1){
                s++;
            }
            n=n>>1;
        }
        return s;
    }
}