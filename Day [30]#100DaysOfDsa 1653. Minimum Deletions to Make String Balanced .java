class Solution {
    public int minimumDeletions(String s) {
        int cb = 0;
        int dlt = 0;

        for(char c : s.toCharArray()) {
            if(c == 'a') {
                dlt = Math.min(dlt + 1, cb);
            } else {
                cb++;
            }
        }

        return dlt;
    }
}