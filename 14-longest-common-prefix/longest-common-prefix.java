class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char first[]=strs[0].toCharArray();
        char last[]=strs[strs.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<first.length){
            if(first[i]==last[i]){
                sb.append(first[i]);
            }else{
                break;
            }
            i++;
        }return sb.toString();
    }
}