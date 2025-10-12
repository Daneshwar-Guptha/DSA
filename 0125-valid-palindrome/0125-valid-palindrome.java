class Solution {
   
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^A-Za-z0-9]","");

        cleaned = cleaned.toLowerCase();
         String cleaned2 = new StringBuilder(cleaned).reverse().toString();
         

        
        return cleaned.equals(cleaned2);
        
    }
}