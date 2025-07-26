import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        visited = new boolean[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start,end,n));
      
    }

    public static int bfs(int start, int end,int n){
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{start,0});
        visited[start] = true;

        while(!q.isEmpty()){
            int[] current = q.poll();
            int pos = current[0];
            int cnt = current[1];

            int enable_dist = arr[pos];

            for(int i=enable_dist; pos+i<=n;i+=enable_dist){  
               int next_pos = pos + i;
            
                if(next_pos == end){       
                    return cnt + 1;
                }
                
                if(!visited[next_pos]){     
                    visited[next_pos] = true;
                    q.offer(new int[]{next_pos, cnt + 1});
                }
            
            }

            for(int i=enable_dist;pos-i>0;i+=enable_dist){
                int next_pos = pos-i;

                if(next_pos == end){
                    return cnt+1;
                }

                if(!visited[next_pos]){
                    visited[next_pos] = true;
                    q.offer(new int[]{next_pos,cnt+1});
                }
            }
            
        }

        
        return -1;
    }
}

