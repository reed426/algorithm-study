class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<food.length;i++){
            int n = food[i]/2;
            for(int j=0;j<n;j++){
                sb.append(i);
            }
        }
        String tmp = sb.toString();
        answer = tmp + '0' + sb.reverse();

        return answer;
    }
}