class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans=0;
        int curr_time=0;
        for(int cust[] : customers){
            if (curr_time < cust[0]) {
                curr_time = cust[0];
            }
            ans +=  curr_time + cust[1] - cust[0];
            curr_time +=cust[1];
        }

        return ans/customers.length;
    }
}