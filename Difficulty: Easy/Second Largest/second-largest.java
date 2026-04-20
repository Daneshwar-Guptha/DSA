class Solution {
    public int getSecondLargest(int[] arr) {
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>first){
                second = first;
                first = i;
           
        }
         else if(i>second && i!= first){
                second= i;
            }
            
            
        if (second == Integer.MIN_VALUE){
            second = -1;
        }
        }
        return second;
    }
}