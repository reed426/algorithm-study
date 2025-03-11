import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            list.add(num);
        }
        int a =  Arrays.stream(arr).min().getAsInt();
        
        list.removeIf(n->n==a);
        
       
        if(arr.length==1){
            list.clear();
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
        
        
    }
}