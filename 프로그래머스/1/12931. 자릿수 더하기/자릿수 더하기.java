import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tmp = Integer.toString(n);
        char[] arr = tmp.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            answer+= Integer.parseInt(arr[i]+"");
        }
        return answer;
    }
}