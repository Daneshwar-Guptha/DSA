class Solution {
    public boolean isPowerOfTwo(int n) {
        int n1 =1;
       if(n<=0) return false;
       return (n & n-1)==0;
    }
}