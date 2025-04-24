class Solution {
    public String convertToTitle(int ColNum) {
        StringBuilder result = new StringBuilder();

        while(ColNum > 0)
        {
            ColNum--;
            int rem = ColNum % 26;
            char ch = (char) ('A' + rem);
            result.append(ch);

            ColNum = ColNum / 26;
        }
        return result.reverse().toString();
    }
}
