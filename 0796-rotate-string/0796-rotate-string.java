class Solution {
    public String rotateString(String s, String goal,int n){
        String result = "";
        for(int i= n;i<s.length();i++){
            result+= s.charAt(i);
        }
        for(int i=0;i<n;i++){
            result+= s.charAt(i);
        }
        return result;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
          String value =  rotateString(s,goal,i);
          System.out.println(value.equals(goal));
          if(value.equals(goal)){
            return true;
          } 
        }
        return false;
    }
}