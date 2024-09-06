class Solution {
    public String stringHash(String s, int k) {
        

        int sum=0, temp=k;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(temp==0){
                sum %=26;
                str.append((char)(sum+'a'));
                temp = k;
                sum=0;
            }
            temp--;
            sum += (int)s.charAt(i)-'a';
        }
        if(temp!=k){
            sum %=26;
            str.append((char)(sum+'a'));
        }
        return str.toString();
    }
}