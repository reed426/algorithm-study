import java.lang.Math;
class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        int value = 0;
        char[] arr = s.toCharArray();
        if(size%2!=0){
            value=size/2;
            answer = arr[value]+"";
        }else{
            value = size/2;
            answer += s.charAt((int)Math.ceil(value)-1)+"";
            answer+= s.charAt((int)Math.floor(value))+"";
            
        }
        
        return answer;
    }
}