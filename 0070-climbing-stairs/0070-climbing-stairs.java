class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int one = 2; // ways to reach step n-1
        int two = 1; // ways to reach step n-2
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = one + two; 
            two = one; 
            one = current; 
        }

        return current;
    }
}
