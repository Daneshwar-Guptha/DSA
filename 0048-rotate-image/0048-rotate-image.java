import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        HashMap<List<Integer>,Integer> values = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                
                values.put(Arrays.asList(i,j), matrix[i][j]);
                 matrix[i][j] = matrix[matrix.length-j-1][i];
                if(values.containsKey(Arrays.asList(matrix.length-j-1,i))){
                     matrix[i][j] = values.get(Arrays.asList(matrix.length-j-1,i));
                }
              
                System.out.print(matrix[matrix.length-j-1][i]+" ");
            }
            
            System.out.println();
        }
        System.out.println(values);
        
    }
}