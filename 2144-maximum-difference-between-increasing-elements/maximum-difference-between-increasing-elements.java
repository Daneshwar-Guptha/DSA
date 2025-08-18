class Solution {
    public int maximumDifference(int[] nums) {
       int smallest = nums[0];
        int max =0;
        int[] result = new int[2];
        
        for (int i = 1; i < nums.length; i++) {

          if(smallest>nums[i-1]){
            smallest = nums[i-1];
            result[0] = i-1;
          }
            
         if(nums[i]-smallest>max){
            max = nums[i]-smallest;
            result[1] = i;


         }

        }
        if(max==0){
          return -1;
        }

        return max;
        
    }
}