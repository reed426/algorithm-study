import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();

        int pos = 0;
        int num = 1;

        // 입력받은 숫자의 끝자리에 도달할때까지 반복돌려
       while(pos < target.length()) {
            String tmp = String.valueOf(num); //점점 늘려나갈 수
            
           for(int i = 0; i < tmp.length(); i++) {
            if(pos < target.length() && tmp.charAt(i) == target.charAt(pos)) {
                pos++; 
            }
        }
            num++;
        }
        System.out.println(num-1);
        
    }
}