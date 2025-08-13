import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
      int value =0;
      ArrayList<Integer> result = new ArrayList<>();
      for(int i= arr.length-1;i>=0;i--){
          if(value<=arr[i]){
              result.add(arr[i]);
              value = arr[i];
          }
      }
      
      Collections.reverse(result);
      return result;
    }
}
