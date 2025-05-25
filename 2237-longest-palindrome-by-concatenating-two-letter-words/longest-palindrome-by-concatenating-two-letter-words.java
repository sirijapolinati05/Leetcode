public class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        int result = 0;
        boolean hasCentral = false;

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            String rev = new StringBuilder(word).reverse().toString();

            if (word.equals(rev)) {
                // Palindromic word like "gg"
                int pairs = countMap.get(word) / 2;
                result += pairs * 4;

                // Check if there's one extra to use in the center
                if (countMap.get(word) % 2 == 1) {
                    hasCentral = true;
                }
            } else if (word.compareTo(rev) < 0 && countMap.containsKey(rev)) {
                // Pair "ab" with "ba" only once
                int pairs = Math.min(countMap.get(word), countMap.get(rev));
                result += pairs * 4;
            }
        }

        if (hasCentral) {
            result += 2;
        }

        return result;
    }
}
