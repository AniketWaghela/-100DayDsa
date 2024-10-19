class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1 || k==1) return '0';
        String ans = Recursion(n);
        return ans.charAt(k-1);
    }

    public String Recursion(int n){
        if(n == 0 ){
            return "0";
        }
        else{
            String  temp = Recursion(n-1);
            return  temp+"1"+ new StringBuilder(invert(temp)).reverse().toString();
        }
    }

    public static String invert(String s) {
        StringBuilder inverted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                inverted.append('1');
            } else {    
                inverted.append('0');
            }
        }
        return inverted.toString();
    }
}