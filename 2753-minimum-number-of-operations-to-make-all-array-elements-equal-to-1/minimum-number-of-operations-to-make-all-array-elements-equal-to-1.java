class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count1=0;
        for(int i:nums){
            if(i==1){
                count1++;
            }
        }
        if(count1>0){
            return (n-count1);
        }
        int operation=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int g=nums[i];
            for(int j=i+1;j<n;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    operation=Math.min(operation,j-i);
                    break;
                }
            }
            if(operation==Integer.MAX_VALUE)return -1;
        }
        return operation+n-1;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}