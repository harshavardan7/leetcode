import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(j < s.length ()){
            Character ch=s.charAt(j);
            if( map.containsKey(ch)){
                i=Math.max(i,map.get(ch)+1);
                }
                int d=j-i+1;
                if(d>ans){
                    ans=d;
                }
                map.put(ch,j);
                j++;
            }
            return ans;


    }
}