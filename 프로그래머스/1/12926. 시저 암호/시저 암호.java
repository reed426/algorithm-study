class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for(char c: arr){
            if (c==' '){
                answer+=' ';
            }
            else if('A'<= c && c<='Z'){
                int tmp = c-'A';
                System.out.println(tmp);
                answer += (char)('A'+(tmp+n)%26);
            }else if('a'<=c && c<='z'){
                int tmp = c-'a';
                 answer += (char)('a'+(tmp+n)%26);
            }
            
        }
       
    
        
        
        
        return answer;
    }
}