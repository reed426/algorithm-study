import java.io.*;
import java.util.StringTokenizer;


class Main {
    static int[][] arr;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(r>0){
            for(int i=0;i<Math.min(n,m)/2;i++){
                int tmp = 0;
                int x = i;
                int y = i;

                int init = arr[x][y];
                while(tmp < 4){
                    int nx = dx[tmp] + x;
                    int ny = dy[tmp] + y;

                    if(nx < n-i && nx>=i && ny <m-i && ny >=i){
                       arr[x][y] =  arr[nx][ny];
                        x = nx;
                        y = ny;
                    }else{
                        tmp++;
                    }

                }

                arr[i+1][i] = init;
                }
            r--;


        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
