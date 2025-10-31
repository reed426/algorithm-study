import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int num = people.length;
        Arrays.sort(people);
        
        int tmp=0;
        for(int i=num-1;i>=tmp;i--){
            if(people[i]+people[tmp]<=limit){
                tmp++;
                answer++;
            }
            else{
                answer++;
            }
        }
        return answer;
    }
}