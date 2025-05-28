class Solution {
    public int differenceOfSums(int n, int m) {
         int k = n / m;

        //Using variables for clarity
        int totalSum = n * (n + 1) / 2;
        int divisibleSum = m * k * (k + 1) / 2;
        int nonDivisibleSum = totalSum - divisibleSum;

        return nonDivisibleSum - divisibleSum;
    }
}