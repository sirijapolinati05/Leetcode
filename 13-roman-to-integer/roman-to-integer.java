class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        int result = hash.get(s.charAt(s.length() - 1));

        for(int i = s.length() - 2; i >= 0; i--)
        {
            if(hash.get(s.charAt(i)) < hash.get(s.charAt(i + 1)))
            {
                result = result - hash.get(s.charAt(i));
            }
            else
            {
                result = result + hash.get(s.charAt(i));
            }
        }
        return result;
    }
}
