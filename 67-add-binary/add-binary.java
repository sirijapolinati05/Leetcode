class Solution {
    public String addBinary(String a, String b) {
        // Step 1: Set pointers to the end of both strings (right-most digits)
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Step 2: StringBuilder to store result in reverse order
        StringBuilder result = new StringBuilder();

        // Step 3: Variable to hold carry during addition
        int carry = 0;

        // Step 4: Loop until both strings are fully processed
        while(i >= 0 || j >= 0) {
            int sum = carry;  // Start with carry

            // Step 5: If a still has digits, add current digit to sum
            if(i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int ('1' → 1, '0' → 0)
                i--;  // Move to previous digit
            }

            // Step 6: If b still has digits, add current digit to sum
            if(j >= 0) {
                sum += b.charAt(j) - '0';  // Convert char to int
                j--;  // Move to previous digit
            }

            // Step 7: Add the current bit (0 or 1) to result
            result.append(sum % 2);  // sum = 0,1,2 → append 0 or 1

            // Step 8: Update carry for next iteration
            carry = sum / 2;  // Only 1 or 0
        }

        // Step 9: If carry is still left, append it
        if(carry != 0) {
            result.append(carry);
        }

        // Step 10: Reverse result and return as final binary string
        return result.reverse().toString();
    }
}
