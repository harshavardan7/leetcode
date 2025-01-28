class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>r=new ArrayList<>();
        r.add(1);
        long p=1;
        for(int i=1;i<=rowIndex;i++){
            long next_val=p*(rowIndex-i+1)/i;
            r.add((int)next_val);
            p=next_val;
        }
        return r;
    }
}