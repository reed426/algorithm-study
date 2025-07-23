import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static String[][] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};
    static Set<String> result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        result = new HashSet<>();
       
        arr = new String[5][5];

        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[i][j] = st.nextToken();
            }
        }

        sb = new StringBuilder();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                dfs(i,j,0);
            }
        }

       System.out.println(result.size());
    }

    static void dfs(int x, int y, int depth){
        sb.append(arr[x][y]);
        
        if(depth==5){
            result.add(sb.toString());
            sb.deleteCharAt(sb.length()-1);
            return;
        }

        for(int i=0;i<4;i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx>=0 && nx<5 && ny >=0 && ny<5){
                dfs(nx,ny,depth+1);
            }  
        }

       sb.deleteCharAt(sb.length()-1);
    }
}