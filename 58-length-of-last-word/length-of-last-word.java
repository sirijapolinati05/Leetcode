class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        // Start from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // If it's a space and we haven't started counting, skip it
            if (ch == ' ' && count == 0) {
                continue;
            }
            // If it's a space and we already started counting, break (end of last word)
            if (ch == ' ') {
                break;
            }

            // Count the character (it's part of the last word)
            count++;
        }

        return count;
    }
}
