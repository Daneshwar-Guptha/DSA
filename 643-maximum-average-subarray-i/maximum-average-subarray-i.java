class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double current=0;
       double sum=0;
       for(int i=0;i<k;i++){
      sum+=nums[i];
       }
   current = sum/k;
        
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            double value = sum/k;
            if(current<value){
                current = sum/k;
            }

            
        }
        return current;
    }
}