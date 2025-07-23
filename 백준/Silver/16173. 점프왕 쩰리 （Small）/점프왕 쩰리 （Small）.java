import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[][] arr;
    static boolean[][] visited;
    static StringTokenizer st;
    static int[] dx = {0,1};
    static int[] dy = {1,0};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited[0][0] = true;
        dfs(0,0);
        System.out.println("Hing");
 
    }
    static void dfs(int x,int y){
        if(arr[x][y] == -1){
            System.out.println("HaruHaru");
            System.exit(0);
        }

        for(int i=0;i<2;i++){
            int nx = dx[i]*arr[x][y] +  x;
            int ny = dy[i]*arr[x][y] + y;
            if(nx>=n || ny >= n || visited[nx][ny]==true) {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx,ny);
        }
    }

  
}

