import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];

        for(int i=0;i<n+1;i++){
            arr[i] = i;
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(check==0){
                union(a,b);
            }else{
                if(isUnion(a,b)) bw.write("YES\n");
                else bw.write("NO\n");
            }

        }

        bw.flush();


    }

    public static int find(int x){
        if(arr[x] == x) return x;
        return arr[x] = find(arr[x]);
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return;
        arr[y] = x;
    }

    public static boolean isUnion(int x,int y){
        x = find(x);
        y = find(y);

        return x == y;
    }

}
