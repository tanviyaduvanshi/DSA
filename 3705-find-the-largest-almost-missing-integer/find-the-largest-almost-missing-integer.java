class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count this number only once for this window
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}