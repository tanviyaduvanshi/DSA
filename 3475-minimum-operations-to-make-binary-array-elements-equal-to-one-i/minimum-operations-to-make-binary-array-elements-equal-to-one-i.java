class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<=n-3;i++){
            if(nums[i]==0){
                count++;
                for(int j=i;j<i+3;j++){
                    nums[j]=1-nums[j];
                }   
            }
        }
        for (int val : nums) {
            if (val == 0) return -1; // if any zero remains
        }return count;
    }
}