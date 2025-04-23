import java.util.HashMap;

class Solution 
{
    public int romanToInt(String s) 
    {
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int total = 0;

        int length = s.length();

        for(int i = 0; i < length; i++) 
        {
            int current = roman.get(s.charAt(i));

            if(i < length - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) 
            {
                total = total - current;
            }
            else 
            {
                total = total + current;
            }
        }
        return total;
    }
}
