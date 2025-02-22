import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
      List<Integer> tmp= new ArrayList<>();
        Arrays.sort(arr);
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                tmp.add(arr[i]); 
            }
        }
         if(tmp.size()==0){
            tmp.add(-1);
        }
        int[] answer = new int[tmp.size()];
        int idx=0;
       
        for(int a: tmp){
            answer[idx] = a;
            idx++;
        }
        
        return answer;
    }
}