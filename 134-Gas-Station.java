class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc){
            return -1;
        }
        int cg=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            cg+=gas[i]-cost[i];
            if(cg<0){
                cg=0;
                start=i+1;
            }
        }
        return start;
    }
}