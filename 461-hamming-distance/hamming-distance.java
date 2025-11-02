class Solution {
    public int hammingDistance(int x, int y) {
        String b1=String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String b2=String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        int count=0;
        for(int i=0;i<32;i++){
            if(b1.charAt(i)!=b2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}