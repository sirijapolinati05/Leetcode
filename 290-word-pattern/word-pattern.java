class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // If pattern length and words length mismatch, return false
        if(pattern.length() != words.length)
        {
            return false;
        }

        Map<Character, String> mapCharToWord = new HashMap<>();
        Map<String, Character> mapWordToChar = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) 
        {
            char ch1 = pattern.charAt(i);
            String ch2 = words[i];

            // Check char → word mapping
            if(mapCharToWord.containsKey(ch1)) 
            {
                if(!mapCharToWord.get(ch1).equals(ch2)) 
                {
                    return false;
                }
            } 
            else 
            {
                mapCharToWord.put(ch1, ch2);
            }

            // Check word → char mapping
            if(mapWordToChar.containsKey(ch2)) 
            {
                if(mapWordToChar.get(ch2) != ch1) 
                {
                    return false;
                }
            } 
            else 
            {
                mapWordToChar.put(ch2, ch1);
            }
        }

        return true;
    }
}
