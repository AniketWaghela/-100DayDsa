class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        // Set<Character> set = new HashSet<>();
        boolean set[] = new boolean[26];
        for(int i=0;i<allowed.length();i++){
            // set.add(allowed.charAt(i));
            set[allowed.charAt(i)-'a'] = true;
        }

        int flag =0,count=0;
        for(String s: words){
            for(int i=0;i<s.length();i++){
                // if(!set.contains(s.charAt(i))){
                if(set[s.charAt(i)-'a']== false){
                    flag =1;
                    break;
                }
            }
            if(flag != 1){
                count++;
            }
            flag =0;
        }
        return count;
    }
}