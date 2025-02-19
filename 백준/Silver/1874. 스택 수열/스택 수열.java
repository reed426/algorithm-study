import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int lastNum = 1;  

        boolean possible = true;  

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());

         
            while (lastNum <= tmp) {
                s.push(lastNum++);
                sb.append("+\n");
            }

           
            if (!s.isEmpty() && s.peek() == tmp) {
                s.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            bw.write(sb.toString());
        } else {
            bw.write("NO\n");
        }

        bw.flush();
        bw.close();
    }
}
