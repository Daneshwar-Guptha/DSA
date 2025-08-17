class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] P = new double[n + 1];
        P[0] = 1.0;
        double W = 1.0; 
        double ans = 0.0;

        for (int i = 1; i <= n; i++) {
            P[i] = W / maxPts;
            if (i < k) {
                W += P[i];
            } else {
                ans += P[i];
            }
            int out = i - maxPts;
            if (out >= 0 && out < k) {
                W -= P[out];
            }
        }
        return ans;
    }
}