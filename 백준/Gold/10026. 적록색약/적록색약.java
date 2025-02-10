import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0,0,-1,1}; //상하좌우
    static int[] dy = {1,-1,0,0};
    static int nx,ny;
    static char[][] arr;
    static boolean[][] visited;
    static int n,cnt;
    static Deque<int[]> q = new LinkedList<>() ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
       cnt = 0;
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            String st = br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j] = st.charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    cnt++;
                    bfs(i,j);
                }
            }
        }

        bw.write(cnt+" ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='R'){
                    arr[i][j] = 'G';
                }
            }
        }
        cnt=0;
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    cnt++;
                    bfs(i,j);
                }
            }
        }
        bw.write(cnt+"");

        bw.flush();
    }
    public static void bfs(int x, int y) {
        visited[x][y] = true;
        q.offer(new int[]{x,y});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for(int i=0;i<4;i++){
                nx = tmp[0]+dx[i];
                ny = tmp[1]+dy[i];
                if(nx<0 || ny<0 || nx>= n|| ny>=n) continue;
                if(arr[tmp[0]][tmp[1]]!=(arr[nx][ny])) continue;
                if(visited[nx][ny]) continue;
                visited[nx][ny]= true;
                q.offer(new int[]{nx, ny});
            }
        }

    }

}

