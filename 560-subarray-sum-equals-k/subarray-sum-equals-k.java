class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashSet<Integer> arr = new HashSet<>();
      
        for(int i=0;i<nums.length;i++){
           int sum =0;
            int values =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                values++;
                if(sum==k){
                    count++;
                  

                }

            }
        }
        return count;
        
    }
}