class Solution {
    public int[] findErrorNums(int[] arr) {
        int result[] = new int[2];
\t\tint n = arr.length;
\t\tint freq[] = new int[n + 1];
\t\tfor(int i = 0; i < n; i++) {
\t\t\tfreq[arr[i]]++;
\t\t}
\t\tfor(int i = 0; i <= n; i++) {
\t\t\tif(freq[i] == 2) {
\t\t\t\tresult[0]= i;
\t\t\t}
\t\t\telse if(freq[i] == 0) {
\t\t\t\tresult[1] = i;
\t\t\t}
\t\t}
\t\treturn result;
    }
}