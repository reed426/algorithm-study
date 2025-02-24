import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String s_answer="";
        String[] word ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        HashMap<String,Integer> m = new HashMap<>();
        for(int i=0;i<10;i++){
            m.put(word[i],i);
        }
        char[] arr = s.toCharArray();
        String tmp="";
        
        for(char c: arr){
            if(Character.isDigit(c)){
                s_answer+=c;
            }
            else{
                tmp+=c;
                if(m.containsKey(tmp)){
                    s_answer+=m.get(tmp);
                    tmp="";
                }
            }
            
        }
        answer = Integer.parseInt(s_answer);
       
        return answer;
    }
}