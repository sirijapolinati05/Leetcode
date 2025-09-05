class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0)
        {
            return result;
        }

        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        while(i < n)
        {
            int j = i;
            while(j < n && nums[j] == nums[i])
            {
                j++;
            }

            int count = j - i;
            if(count > n / 3)
            {
                result.add(nums[i]);
            }
            i = j;
        }
        return result;
    }
}
