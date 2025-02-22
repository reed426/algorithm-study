import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String tmp = br.readLine();
        int n = tmp.length();
        int cnt = 0;
        Stack<String> s = new Stack<>();
        for(int i=0;i<n;i++){
            String a = tmp.charAt(i)+"";
            if(a.equals("(")){
               s.push("(");
            }
            else{
                if(!s.empty()&&s.peek().equals("(")){
                    s.pop();
                }else{
                    cnt+=1;
                }
            }
            
        }
        if(!s.empty()){
            cnt+=s.size();
        }
        bw.write(cnt+"");
        bw.flush();
    }
}