class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split("");
        
        int cnt = 1;
        for(String a: array){
            if(!a.equals(" ")){
                if(cnt%2==0){
                    answer+=a.toLowerCase();  
                    cnt++;
                }
                else{
                    answer += a.toUpperCase();
                    cnt++;
                }
                
               
            }
            else{
                answer+= " ";
                cnt=1;
            }
          
            
        }
        System.out.println(answer);
        return answer;
    }
}