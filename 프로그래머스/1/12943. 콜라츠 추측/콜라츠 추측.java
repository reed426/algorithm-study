class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt=0;
        int a = num;
        while(a!=1){
            System.out.println(a);
            cnt +=1;
            if(a%2==0){
                a =a/2;
                if(a==1)break; 
                continue;
            }
            if(a%2==1){
                a = a*3+1;
                if(a==1)break;
               continue;
            }
            if(cnt==500){
                answer=-1;
                break;
            }
           
          
        }
        if(answer!=-1){
            answer=cnt;
        }
        
        return answer;
    }
}