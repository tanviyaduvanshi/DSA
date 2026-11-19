class Solution {
    public int minChanges(String s) {
        int countOne=0;
        int countZero=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i+1))countZero++;
            //else countOne++;
            i++;
        }
        return countZero;
    }
}