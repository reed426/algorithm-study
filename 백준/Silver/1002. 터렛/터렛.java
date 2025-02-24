import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int dist = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
            int sum = (r2+r1)*(r2+r1);
            int sub = (r2-r1)*(r2-r1);

            if(x1==x2 && y1==y2 && r1==r2) {
                bw.write("-1\n");
            }
            else if(dist > sum || dist <sub) {
                bw.write("0\n");
            }
            else if(dist == sum) {
                bw.write("1\n");
            }
            else if(dist == sub) {
                bw.write("1\n");
            }
            else{
                bw.write("2\n");

        }

        }
        bw.flush();
    }

    }