import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

// The main method must be in a class named "Main".
class Main {
    static int[][] arr;
    static int n,m;
    static boolean[][] visited;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        visited = new boolean[n][m];
        
        for(int i = 0; i<n;i++){
            String tmp = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = Character.getNumericValue(tmp.charAt(j));
            }
        }  
        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Point p = q.poll();
            for(int i=0;i<4;i++){
                int nx = p.x+dx[i];
                int ny= p.y+ dy[i];

                if(nx>=0 && ny>=0 && nx<n && ny<m && !visited[nx][ny] &&arr[nx][ny]==1){
                    q.add(new Point(nx,ny));
                    arr[nx][ny] = arr[p.x][p.y] +1;
                    visited[nx][ny] = true;
                }
            }
        }
    }
}