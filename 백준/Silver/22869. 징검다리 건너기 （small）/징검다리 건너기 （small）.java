import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] A= new int[n];
        int[] dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for(int i=0;i<n-1;i++){
            if(dp[i] == 1){
                for(int j=i+1;j<n;j++){
                    if((j-i)*(1+Math.abs(A[i]-A[j]))<=k){
                        dp[j]=1;
                    }
                }
            }
        }

       if(dp[n-1]==1){
           bw.write("YES");
       }else{
           bw.write("NO");
       }
       bw.flush();

    }

}
