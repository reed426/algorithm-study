import java.io.*;
import java.util.*;

class Main {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        long sum =0;
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x =  Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
            sum += y;
        }


        long mid = (sum+1)/2;

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
        
        long result =0;
        for(int i=0;i<n;i++){
            result += arr[i][1];
            if(mid <= result){
                System.out.println(arr[i][0]);
                break;
            }
        }
    }
}