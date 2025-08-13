class Solution {
    public int singleNumber(int[] nums) {
        int value =0;
        if(nums.length>1){
            value = nums[0];
          for(int i=1;i<nums.length;i++){
              value =nums[i]^ value;
               
            
        }
        }
        else{
            value = nums[0];
        }

        
       


        return  value;
        
    }
}