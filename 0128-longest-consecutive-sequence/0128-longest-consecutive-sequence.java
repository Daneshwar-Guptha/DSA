import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int count =1;
        int result =1;
        Arrays.sort(nums);
        if(nums.length ==0){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                count =1;
            }
            if(count>result){
                result = count;
            }
        }
        return result;
    }
}