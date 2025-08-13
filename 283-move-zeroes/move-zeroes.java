class Solution {
    void swap(int[] arr,int n1,int n2){
      int temp = arr[n2];
      arr[n2] = arr[n1];
      arr[n1] = temp;
    

    }

    public void moveZeroes(int[] nums) {
        int n1 =0;
        int n2 =0;


        for(int i=0;i<nums.length;i++){
            if(nums[n2]!=0){
                swap(nums,n1,n2);
                n1++;
            }
            n2++;
        }
        
    }
}