class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploreMap = new HashMap<>();

        for (int num : nums) {
            exploreMap.put(num, false);
        }

        for (int num : nums) {
            if (exploreMap.get(num)) {
                continue;
            }

            int currentLength = 1;
            exploreMap.put(num, true);

            int nextNum = num + 1;
            while (exploreMap.containsKey(nextNum) && !exploreMap.get(nextNum)) {
                exploreMap.put(nextNum, true);
                currentLength++;
                nextNum++;
            }

            int prevNum = num - 1;
            while (exploreMap.containsKey(prevNum) && !exploreMap.get(prevNum)) {
                exploreMap.put(prevNum, true);
                currentLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}
