class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        String[] arrS = s.split("");
        String[] arrT = t.split("");

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
