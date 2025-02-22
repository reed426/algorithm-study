class Solution {
    public String solution(String[] seoul) {
        int index=0;
        
        for(String k: seoul){
            if(k.equals("Kim")){
                break;
            }
            index++;
        }
        String answer = "김서방은 "+index+"에 있다";
      return answer;  
    }
}