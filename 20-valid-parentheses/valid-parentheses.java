class Solution {
    public boolean isValid(String s) {
        // Stack to store opening brackets
        Stack <Character> st = new Stack<>();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets onto the stack
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // Check if the stack is not empty and if the top matches the corresponding opening bracket
                if(!st.isEmpty() && (
                    (ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{') ||
                    (ch == ']' && st.peek() == '[')
                )) {
                    st.pop(); // Pop the matched opening bracket
                } else {
                    return false; // Invalid if no match or stack is empty
                }
            }
        }

        // If stack is empty, all brackets matched, otherwise invalid
        return st.isEmpty();
    }
}
