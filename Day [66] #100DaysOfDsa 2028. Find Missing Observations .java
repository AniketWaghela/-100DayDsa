class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum=0;
        for(int i: rolls){
            sum+=i;
        }

        int[] arr = new int[n];
        sum = (mean)*(rolls.length +n) -sum;
        
        if(6*n < sum || sum < 0 || sum < n){
            return new int[] {};
        }
        else {
            Arrays.fill(arr, sum/n);
            for(int i=0;i<sum%n;i++){
                 ++arr[i];
            }             
        }

        return arr;

    }
}