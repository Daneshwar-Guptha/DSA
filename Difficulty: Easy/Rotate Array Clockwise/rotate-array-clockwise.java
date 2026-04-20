class Solution {
    
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateclockwise(int[] arr, int k) {
        
        int n = arr.length;
        
        if(n <= 1) return;  // ✅ handle edge case
        
        k = k % n;

        // Step 1
        reverse(arr, 0, n - 1);

        // Step 2
        reverse(arr, 0, k - 1);

        // Step 3
        reverse(arr, k, n - 1);
    }
}