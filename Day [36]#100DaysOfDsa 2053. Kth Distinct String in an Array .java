class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String,Integer> map = new HashMap<>();
        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        String ans = "";
        int count = 0;
        for (String x : arr) {
            if (map.get(x) == 1) {
                ans = x;
                count++;
            }
            if (count == k) {
                return ans;
            }
        }
        
        return "";
    }
}