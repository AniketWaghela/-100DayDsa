class Solution {

    public void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public int maximumSwap(int num) {
        
        String numStr = Integer.toString(num);

        int[] digits = new int[numStr.length()];  
        int[] copyArray = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
            copyArray[i] = numStr.charAt(i) - '0';
        }
        
        Arrays.sort(copyArray);
        int index = -1;
        
        int r = copyArray.length-1;
        for(int i=0; i<numStr.length() ; i++){
            if(copyArray[r--] != digits[i]){
                index = i;
                break;
            }
        }

        int maxIndex = index;
        if(maxIndex > -1){
            for(int i=index+1; i<numStr.length() ; i++){
                if(digits[maxIndex] <= digits[i]){
                    maxIndex = i;
                }
            } 
        }
        else{
            return num;
        }

        swap(digits , index ,maxIndex);
        int reconstructedNum = 0;
        for (int digit : digits) {
            reconstructedNum = reconstructedNum * 10 + digit;
        }
        
        return reconstructedNum;
    }
}