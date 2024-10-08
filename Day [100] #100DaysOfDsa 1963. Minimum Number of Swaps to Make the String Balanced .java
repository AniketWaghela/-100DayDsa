class Solution {
    public int minSwaps(String s) {
    
        int openBracket =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                openBracket++;
            }
            else if(openBracket >0){
                openBracket--;
            }
        }
        return (openBracket + 1) / 2;
    }
}



// class Solution {
//     public int minSwaps(String s) {
        
//         Stack<Character> st = new Stack<>();
        
        
//         for(int i=0;i<s.length();i++){
//             if(st.isEmpty()){
//                 st.push(s.charAt(i));
//                 continue;
//             }
//             if(s.charAt(i) == ']'){
//                 if(st.peek() == '['){
//                     st.pop();
//                 }
//                 else{
//                     st.push(s.charAt(i));
//                 }
//             }
//             else{
//                 st.push('[');
//             }
//         }

//         return st.size()%4 == 0 ? st.size()/4 : (st.size()/4)+1;
//     }
// }

