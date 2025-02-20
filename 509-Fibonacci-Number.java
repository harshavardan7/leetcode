class Solution {
    public int fib(int n) {
      return fibfo(n);
    }
    public int fibfo(int num){
          if(num==0||num==1) return num;
        int n1=fibfo(num-1);
        int n2=fibfo(num-2);
        return n1+n2;
    }
}