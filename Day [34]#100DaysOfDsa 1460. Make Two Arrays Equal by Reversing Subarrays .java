class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element : arr){
            map.put(element,(map.getOrDefault(element,0)+1));
        }
        for(int element :target){
            if(!map.containsKey(element)){
                return false;
            }
            map.put(element,(map.get(element)-1));
            if(map.get(element)==0){
                map.remove(element);
            }
        }
        return map.isEmpty();
    }
}