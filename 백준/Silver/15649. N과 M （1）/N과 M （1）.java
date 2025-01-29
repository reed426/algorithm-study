import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        dfs(0);

    }
    public static void dfs(int d){
        if(d==m){
            for(int i=0;i<m;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                arr[d]=i+1;
                dfs(d+1);
                visited[i] = false;
            }
        }
    }


}
