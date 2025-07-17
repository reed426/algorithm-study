import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int cnt;
    static int tmp;
    static String[] answer = {"WBWBWBWB","BWBWBWBW"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] chess = new String[n];

        for(int i=0;i<n;i++){
            chess[i] = br.readLine();
        }

       
        int result = Integer.MAX_VALUE;
        for(int i=0;i<=n-8;i++){
            for(int j=0;j<=m-8;j++){
                for(int k=0;k<8;k++){
                    int row = i+k;
                    for(int r=0;r<8;r++){
                        int col = j+r;

                        if(chess[row].charAt(col) != answer[row%2].charAt(r)){
                            cnt++;
                        }
                    }
                }
                tmp = Math.min(cnt,64-cnt);
                if(result>tmp){
                    result = tmp;
                }
               cnt=0;
            }
        }

        System.out.println(result);

        
    }
}