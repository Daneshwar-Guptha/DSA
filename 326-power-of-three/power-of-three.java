class Solution {
    public boolean isPowerOfThree(int n) {
       int number =0;

       while(n>(int)Math.pow(3,number)){
        number++;

       }

       return n== Math.pow(3,number);

        
        
    }
}