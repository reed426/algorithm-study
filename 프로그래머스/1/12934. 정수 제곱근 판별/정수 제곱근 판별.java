import java.lang.Math;
class Solution {
    public long solution(long n) {
       double answer = 0;
       double res = Math.sqrt(n);
        int contr= (int)res;
        if(res==contr){
            answer= (res+1)*(res+1);
        }else{
           answer=-1;
        };
        return (long)answer;
    }
}