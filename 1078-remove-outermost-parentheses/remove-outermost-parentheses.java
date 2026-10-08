class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(count>0)str.append(c);
                count++;
            }
            else{
                // this else is for s.charAt(i)==')'
                count--;
                if(count>0)str.append(c);
            }
           
        }
        return str.toString();
    }
}