class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char ch : word.toCharArray()) {
            arr[ch - 'a']++;
        }
        Arrays.sort(arr);
        int res = 0;
        int cnt = 0;
        for (int i = 25; i >= 0; i--) {
            res += arr[i] * (cnt++ / 8 + 1);
            if(arr[i]==0) break;
        }
        return res;
    }
}