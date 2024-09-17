class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String,Boolean> map = new HashMap<>();
        
        for (String word : s1.split(" ")) {
            if(map.containsKey(word)){
                map.put(word,false);
            }
            else{
                map.put(word,true);
            }
        }
        for (String word : s2.split(" ")) {
            if(map.containsKey(word)){
                map.put(word,false);
            }
            else{
                map.put(word,true);
            }
        }

        Set<String> keySet = map.keySet();
        List<String> uncommonWords = new ArrayList<>();

        for (String key : keySet) {
            if (map.get(key)) {
                uncommonWords.add(key);
            }
        }
        
        return uncommonWords.toArray(new String[0]);
    }
}