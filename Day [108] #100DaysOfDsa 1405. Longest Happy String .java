class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        StringBuilder ans  = new StringBuilder();
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        if (a > 0) pq.offer(new int[]{a, 'a'});
        if (b > 0) pq.offer(new int[]{b, 'b'});
        if (c > 0) pq.offer(new int[]{c, 'c'});

        while(!pq.isEmpty()){
            int first[] = pq.remove();

            if(ans.length() >= 2 && ans.charAt(ans.length() - 1) == first[1] &&
                ans.charAt(ans.length() - 2) == first[1]){

                if(pq.isEmpty()) break;

                int second[] = pq.remove();
                ans.append((char)second[1]);
                second[0]--;

                if(second[0] > 0 ) pq.offer(second);
                pq.offer(first);
                
            }
            else{
                ans.append((char)first[1]);
                first[0]--;
                if(first[0] > 0 ) pq.offer(first);
            }
        }

        return ans.toString();
    }
}