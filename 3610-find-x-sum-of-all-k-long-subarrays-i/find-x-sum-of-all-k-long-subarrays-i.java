class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans = new int[n - k + 1];
        for(int i=0;i+k<=nums.length;i++){
            HashMap<Integer,Integer>freq=new HashMap<>();
            for(int j=i;j<k+i;j++){
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }
            List<int[]>pair=new ArrayList<>();
            for(var entry:freq.entrySet()){
                pair.add(new int[]{entry.getKey(),entry.getValue()});
            }
            pair.sort((a,b)->{
                if(b[1]!=a[1])return b[1]-a[1];
                return b[0]-a[0];
            });
            int sum=0;
            int count=0;
            for(int []p:pair){
                if(count==x)break;
                sum+=p[0]*p[1];
                count++;
            }
            ans[i]=sum;
        }
        return ans;
    }
}