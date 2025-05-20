class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[start] and nums[mid]
                    int temp0 = nums[start];
                    nums[start] = nums[mid];
                    nums[mid] = temp0;
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap nums[mid] and nums[end]
                    int temp1 = nums[mid];
                    nums[mid] = nums[end];
                    nums[end] = temp1;
                    end--;
                    break;
            }
        }
    }
}
        