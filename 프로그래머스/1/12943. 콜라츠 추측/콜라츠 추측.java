class Solution {
    public int solution(int num) {
        int answer = 0;
      
        int a = num;
        while(a!=1){
            answer++;
            if(a%2==0){
                a =a/2; 
                continue;
            }
            if(a%2==1){
                a = a*3+1;
               continue;
            }
            if(answer==500){
                return -1;
            }
           
          
        }
        
        
        return answer;
    }
}