import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> m = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            m.put(name[i],yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            int cnt=0;
            for(int j=0;j<photo[i].length;j++){
                if(m.containsKey(photo[i][j])){
                    cnt+=m.get(photo[i][j]);
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}