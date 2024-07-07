class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles >= numExchange){
            int temp = numBottles - numExchange*(numBottles/numExchange) ;
            ans += (numBottles/numExchange);
            numBottles = temp +(numBottles/numExchange);
        }

        return ans;
    }
}