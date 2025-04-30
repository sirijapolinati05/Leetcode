class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (but not 0 itself) can't be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Check for even and odd length palindromes
        return (x == reversed || x == reversed / 10);
    }
}
