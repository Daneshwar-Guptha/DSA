import java.util.*;
class Solution {
    public int longestUniqueSubstr(String s) {
       
        int pointer1 =0;
        int pointer2=0;
        int max =0;
        Set<Character> arr =new HashSet<>();
        while(pointer2<s.length()){
            if(!arr.contains(s.charAt(pointer2))){
                arr.add(s.charAt(pointer2));
                pointer2++;
                max = Math.max(max,(pointer2-pointer1));
            }
            else{
                arr.remove(s.charAt(pointer1));
                pointer1++;
            }
        }
        return max;
        
    }
}