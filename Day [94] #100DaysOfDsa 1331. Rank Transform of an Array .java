class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length<1) return arr;

        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++) temp[i] = arr[i];
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        map.put(temp[0],rank);

        for(int i=1;i<arr.length;i++){
            if(temp[i] != temp[i-1]) map.put(temp[i],++rank);
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}