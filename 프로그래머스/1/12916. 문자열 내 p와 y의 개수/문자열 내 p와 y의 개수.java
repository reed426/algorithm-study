class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt =0;
        int y_cnt = 0;
        for(char c : s.toCharArray()){
            if(c=='p' || c=='P'){
                p_cnt++;
            }
            if(c=='y' || c=='Y'){
                y_cnt++;
            }
        }
        if(p_cnt != y_cnt){
            answer=false;
        }

        return answer;
    }
}