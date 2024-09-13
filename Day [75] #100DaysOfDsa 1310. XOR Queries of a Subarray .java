class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int[] ans = new int[q.length];
        int[] pre = new int[arr.length];

        pre[0] =arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] ^=pre[i-1] ^arr[i];
        }

        for(int i=0;i<q.length;i++){
            ans[i] =  pre[q[i][1]] ^ (q[i][0] > 0 ? pre[q[i][0]-1] : 0);
        }

        return ans;
    }
}