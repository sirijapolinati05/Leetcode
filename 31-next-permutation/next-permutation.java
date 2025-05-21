class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find i such that nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find j such that nums[j] > nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: Reverse nums[i+1 to end]
        int start = i + 1, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
