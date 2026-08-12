class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(map.containsKey(j)){
                int index=map.get(j);
                if(index==i){
                    continue;
                }
                return new int[]{i,index};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}