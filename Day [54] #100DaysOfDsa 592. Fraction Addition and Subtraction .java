class Solution {

    public int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
    }

    public String fractionAddition(String ex) {
        int count = 0 , ansNum = 0 , ansDen = 1;

        int flag = 0;
        while (flag < ex.length()) {
            String num = "", den = "";

            while (flag < ex.length() && ex.charAt(flag) != '/') {
                num += ex.charAt(flag++);
            }

            flag++;

            while (flag < ex.length() && ex.charAt(flag) != '+' && ex.charAt(flag) != '-') {
                den += ex.charAt(flag++);
            }

            ansNum = (ansNum*(Integer.parseInt(den))) + ((Integer.parseInt(num))*ansDen);
            ansDen *= Integer.parseInt(den);

            int gcd = gcd(Math.abs(ansNum), ansDen);
            ansNum /= gcd;
            ansDen /= gcd;
        }

        return ansNum + "/" + ansDen;
    }
}
