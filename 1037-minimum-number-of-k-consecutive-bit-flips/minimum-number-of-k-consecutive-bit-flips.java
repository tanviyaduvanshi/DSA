class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int flip=0;
        int flipcount=0;
        boolean [] isFlipped=new boolean[n];
        Arrays.fill(isFlipped,false);
        for(int i=0;i<n;i++){
            if(i>=k && isFlipped[i-k]==true){
                flipcount--;
            }
            if(flipcount%2==nums[i]){
                if(i+k>n)return -1;
                flip++;
                flipcount++;
                isFlipped[i]=true;
            }
        }
        return flip;
    }
}
