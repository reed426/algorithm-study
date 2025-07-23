import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[][] arr;
    static boolean[] visited;
    static StringTokenizer st;
    static int left,right;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int node = Integer.parseInt(br.readLine());

        arr = new int[num+1][num+1];
        visited = new boolean[num+1];

        for(int i=0;i<node;i++){
            st = new StringTokenizer(br.readLine());
            left = Integer.parseInt(st.nextToken());
            right = Integer.parseInt(st.nextToken());

            arr[left][right] = 1;
            arr[right][left] = 1;
        }
        cnt=0;
        bfs(1);

        
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int i=1;i<arr.length;i++){
                if(arr[tmp][i]==1 && visited[i] == false){
                    q.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

