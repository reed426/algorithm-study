import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int prefix = 0;
        int cnt = 1;

       while(true){
           if(n <= prefix+cnt){
               if(cnt%2==1){
                   System.out.println((cnt+1-n+prefix) + "/" + (n-prefix));
                   break;
               }else{
                   System.out.println((n-prefix) + "/" + (cnt+1-n+prefix));
                   break;
               }
           }else{
               prefix += cnt;
               cnt++;
           }
       }
        

    }
}