import java.io.*;
import java.util.*;


public class Main {
    static char[][] arr;
    static boolean visited[][];
    static int dx[] = new int[]{0, 1, 0, -1};
    static int dy[] = new int[]{1,0,-1,0};
    static int n,m,max;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        arr = new char[n][m];

        for(int i=0;i<n;i++){
            String tmp = br.readLine();
            arr[i] = tmp.toCharArray();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='L'){
                    max = Math.max(max,bfs(i,j));
                }
            }
        }
        bw.write(max+"");
        bw.flush();
        bw.close();
    }
    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[n][m];
        q.add(new int[]{x,y,0});
        visited[x][y] = true;
        max = 0;
        while(!q.isEmpty()){
            int[]tmp  = q.poll();
            max = Math.max(max, tmp[2]);

            for(int i=0;i<4;i++){
                int nx = dx[i]+ tmp[0];
                int ny= dy[i]+tmp[1];

                if(nx>=0 && ny>=0 && nx<n && ny <m && !visited[nx][ny] && arr[nx][ny]=='L') {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny,tmp[2]+1});
                }
            }
        }
        return max;
    }



}





