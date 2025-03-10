
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            String tmp = s.substring(0,i);
            String word = s.charAt(i)+"";
            int num = tmp.lastIndexOf(word);
            if(num!=-1){
                answer[i] = i-num; 
            }else{
                answer[i] = num;
            }
    
        }
        return answer;
    }
}