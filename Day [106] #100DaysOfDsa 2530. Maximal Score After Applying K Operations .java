class Solution {
    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        
        long res =0;
        for(int i=0;i<k;i++){
            int temp = pq.remove();
            if(temp%3 == 0) pq.add(temp/3);
            else pq.add( (temp/3) +1);
            res += temp;
        }
        return res;
    }
}