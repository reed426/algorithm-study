class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int num = p.length();

        for(int i=0;i<=t.length()-num;i++){
            String tmp = "";
            for(int j=i;j<i+num;j++){
                tmp +=t.charAt(j);
            }
            
            if(Long.parseLong(tmp)<= Long.parseLong(p)){
                answer+=1;
            }
            
        }
        
        return answer;
    }
}