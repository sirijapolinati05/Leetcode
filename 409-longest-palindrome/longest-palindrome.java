class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap();
        for(char ch: s.toCharArray())
        {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }      
          
        int result = 0;
        boolean odd_found = false;
        for(int ch: count.values())
        {
            if(ch % 2 == 0) 
            {
                result += ch;
            }
            else
            {
                odd_found = true;
                result += ch - 1;
            }
        }
        if(odd_found) 
        {
            result++;
        }
        return result;
    }
}
