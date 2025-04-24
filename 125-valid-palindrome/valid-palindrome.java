class Solution {
    public boolean isPalindrome(String s) {        //Without 2 pointer technique
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
