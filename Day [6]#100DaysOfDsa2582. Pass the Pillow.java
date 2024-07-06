class Solution {
    public int passThePillow(int n, int time) {
        int ans=0 ,completed = time / (n-1), remaining = time % (n-1);

        if(completed%2 != 0){
            ans = n-remaining;
        }
        else{
            ans = ++remaining;
        } 

        return ans;
    }
}