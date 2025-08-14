class Solution {
    public String largestGoodInteger(String num) {
        String result ="";

        int count=1;
       
        int number =0;
        int max=0;

        char[] array = num.toCharArray();
        for(int i=1;i<array.length;i++){
            if(array[i] ==array[i-1]){
                count++;
            }
            else{
                count=1;

            }

            if(count==3){
                
                max = count;
               
                if(number<((int)array[i])){
                    number =(int) array[i];
                }
            }


        }

    if(max!=3){
        return "";
    }
      String var = Character.toString(number);

        for(int i=0;i<3;i++){
            result+= var;

        }


        return result;
     
        
    }
}