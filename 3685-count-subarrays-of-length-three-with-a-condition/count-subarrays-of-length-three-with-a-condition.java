class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            int fir=nums[i];
            int sec=nums[i+1];
            int thir=nums[i+2];
            if(2*(fir+thir)==sec){
                count++;
            }
        }
        return count;
    }
}