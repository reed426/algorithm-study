class Solution {
    public int[] solution(long n) {
        String tmp = n+"";
        int[] answer = new int[tmp.length()];
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(tmp.charAt(answer.length - i-1)+"");
        }
        return answer;
    }
}