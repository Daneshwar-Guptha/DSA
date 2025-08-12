class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        boolean value = false;
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
            else{
                value= true;
            }

        }

        return value;
        
    }
}