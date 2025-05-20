class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        // Step 1: Mark the ranges using difference array
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            diff[l]++;
            if (r + 1 < n) {
                diff[r + 1]--;
            }
        }

        // Step 2: Apply prefix sum to simulate operations
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += diff[i];
            if (nums[i] > operations) {
                return false;
            }
        }

        return true;
    }
}
