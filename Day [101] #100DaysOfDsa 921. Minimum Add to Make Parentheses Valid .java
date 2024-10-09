class Solution {
    public int minAddToMakeValid(String s) {
        int openBracket=0, closeBracket=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                openBracket++;
            else if(openBracket > 0)
                openBracket--;
            else 
                closeBracket++;
        }
        return openBracket+closeBracket;
    }
}