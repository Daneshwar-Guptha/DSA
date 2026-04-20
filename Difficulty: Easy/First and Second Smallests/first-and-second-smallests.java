class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i :arr){
            if(i<first){
                second = first;
                first = i;
            }
            else if(second>i && i!= first){
                second = i;
            }
        }
        
        if(first == Integer.MAX_VALUE || second == Integer.MAX_VALUE){
            result.add(-1);
            return result;
        }
        result.add(first);
        result.add(second);
        return result;
    }
}
