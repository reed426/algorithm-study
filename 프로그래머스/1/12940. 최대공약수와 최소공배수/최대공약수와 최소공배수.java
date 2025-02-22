class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int g_n = n;
        int g_m = m;
        
        int l_n = n;
        int l_m = m;
        
        //최대 공약수
        while(g_m!=0){
            int temp = g_m;
            g_m = g_n%temp;
            g_n = temp;
        }
        answer[0] = g_n;
        
        answer[1] = l_n*l_m/answer[0];
    
        
        return answer;
    }
}