class Solution {
    public long minimumSteps(String s) {
        long onesFreq =0,res=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                res+= onesFreq;
            }
            else onesFreq++;
        }


        return res;
    }
}