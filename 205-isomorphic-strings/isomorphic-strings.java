class Solution {
    public boolean isIsomorphic(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Character> mapAB = new HashMap<>();
        Map<Character, Character> mapBA = new HashMap<>();

        for (int i = 0; i < a.length(); i++) 
        {
            char chA = a.charAt(i);
            char chB = b.charAt(i);

            if (mapAB.containsKey(chA)) 
            {
                if (mapAB.get(chA) != chB) 
                {
                    return false; 
                }
            } 
            else 
            {
                mapAB.put(chA, chB);
            }

            if (mapBA.containsKey(chB)) 
            {
                if (mapBA.get(chB) != chA) 
                {
                    return false; 
                }
            } 
            else 
            {
                mapBA.put(chB, chA);
            }
        }
        return true;
    }
}
