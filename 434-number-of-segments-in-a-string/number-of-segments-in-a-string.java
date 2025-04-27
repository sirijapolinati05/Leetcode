class Solution {
    public int countSegments(String s) {
        if(s == null || s.length() == 0)
        {
            return 0;
        }
        s = s.trim();

        if(s.length() == 0)
        {
            return 0;
        }

        String[] segments = s.split("\\s+");
        return segments.length;
    }
}
