class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> arr = new HashMap<>();
        arr.put('I',1);
        arr.put('V',5);
        arr.put('X',10);
        arr.put('L',50);
        arr.put('C',100);
        arr.put('D',500);
        arr.put('M',1000);
        int total=0;
        int prev =0;
        
        for(int i=0;i<s.length();i++){
            int currentValue = arr.get(s.charAt(i));
            if(currentValue>prev){
                total+= currentValue-(2*prev);
               
            }
            else{
                total+=currentValue;
            }
             prev = currentValue;

        }

        
        
        return total;
        
        
    }
}