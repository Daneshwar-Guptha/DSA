class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int mid=-1;
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
    
        for(int i=1;i<arr.length;i++){
            arr1[i] = arr[i-1]+arr1[i-1]; 
            
           
           
            
        }
        for(int i=arr.length-2;i>=0;i--){
            arr2[i] = arr[i+1]+arr2[i+1];
        }
        for(int i=0;i<arr.length;i++){
            if(arr1[i]==arr2[i]){
                return i;
            }
        }
        
        return mid;
    }
}
