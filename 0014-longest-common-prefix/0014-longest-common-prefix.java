import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        System.out.println(Arrays.toString(strs));
        int smallest = 999;
        for(String i:strs){
             smallest = Math.min(smallest,i.length());
           
        }
        String result ="";
        for(int i=0;i<smallest;i++){
           int count =0;
            for(int j=0;j<strs.length;j++){
                 String r1 = strs[0].substring(0,i+1);
                 if(r1.equals((strs[j]).substring(0,i+1))){
                    count++;
                   
                 }


            }
            if(count==strs.length){
                   result = strs[0].substring(0,i+1);
            }
           
        }

      
       return result;
        
    }
}