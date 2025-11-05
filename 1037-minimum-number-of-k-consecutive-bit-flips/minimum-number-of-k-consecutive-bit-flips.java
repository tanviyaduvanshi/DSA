class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = k - 1; i < n; i++) {
            nums[i] -= count;
            if ((nums[i - k + 1] + count) % 2 == 0) {
                count++;
            }
        }

        for (int i = n - 1; i >= n - k; i--) {
            if ((nums[i] + count) % 2 == 0) {
                return -1;
            }
        }

        return count;
    }
}
