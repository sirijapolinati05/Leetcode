class Solution {
    public int countSegments(String s) {
        int count = 0;
        int segments = s.length();

        for(int i = 0; i < segments; i++)
        {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
            {
                count++;
            }
        }
        return count;
    }
}
