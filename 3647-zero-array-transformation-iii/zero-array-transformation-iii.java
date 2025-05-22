import java.util.*;

class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;

        // Sort queries by start index
        Arrays.sort(queries, (a, b) -> Integer.compare(a[0], b[0]));

        // Max-heap: store query ends (for available queries)
        PriorityQueue<Integer> available = new PriorityQueue<>((a, b) -> b - a);

        // Min-heap: store query ends (for running/active queries)
        PriorityQueue<Integer> running = new PriorityQueue<>();

        int qIndex = 0;
        int usedQueries = 0;

        for (int i = 0; i < n; i++) {
            // Add all queries starting before or at i to available heap
            while (qIndex < queries.length && queries[qIndex][0] <= i) {
                available.offer(queries[qIndex][1]);
                qIndex++;
            }

            // Remove expired queries (ending before i)
            while (!running.isEmpty() && running.peek() < i) {
                running.poll();
            }

            // How many queries are covering i
            int coverCount = running.size();
            int needed = nums[i] - coverCount;

            // Apply extra queries if needed
            while (needed > 0 && !available.isEmpty()) {
                int end = available.poll();
                if (end >= i) {
                    running.offer(end);
                    usedQueries++;
                    needed--;
                }
            }

            // If still not enough to cover nums[i]
            if (needed > 0) {
                return -1;
            }
        }

        return queries.length - usedQueries; // max queries that can be removed
    }
}
