class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String s: logs){
            if (!s.equals("../") && !s.equals("./")) count++;
            if(s.equals("../") && count>0) count--;
        }
        return count;
    }
}