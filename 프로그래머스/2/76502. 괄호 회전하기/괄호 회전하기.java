import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<String> q = new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
            q.add(s.charAt(i)+"");
        }
        
        
        for(int i=0;i<s.length();i++){
            String one = q.poll();
            q.add(one);
            
            Stack<String> stack = new Stack<>();
            for(int j=0;j<s.length();j++){
                String tmp = q.poll();
                q.add(tmp);
                
                if(stack.isEmpty()){
                    stack.push(tmp);
                }
                else if(tmp.equals(")") && stack.peek().equals("(")){
                    stack.pop();
                }
                else if(tmp.equals("]") && stack.peek().equals("[")){
                    stack.pop();
                }
                else if(tmp.equals("}") && stack.peek().equals("{")){
                    stack.pop();
                }
                else {
                    stack.push(tmp);
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}