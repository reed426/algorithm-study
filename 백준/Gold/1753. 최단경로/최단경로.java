import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
  
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        ArrayList<Node>[] graph = new ArrayList[V+1];

        int[] distance = new int[V+1];

        boolean[] visited = new boolean[V+1];

        for(int i=0;i<=V;i++){
            graph[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=1;i<=E;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v,w));
        }

        PriorityQueue<Node> q = new PriorityQueue<>();
        distance[K] = 0;
        q.offer(new Node(K,0));

        while(!q.isEmpty()){
            Node tmp = q.poll();
            visited[tmp.toNode] = true;
            for(Node node : graph[tmp.toNode]) {
                if(!visited[node.toNode]){
                    if(distance[tmp.toNode] + node.e < distance[node.toNode]){
                        distance[node.toNode] = distance[tmp.toNode] + node.e;
                        q.offer(new Node(node.toNode, distance[node.toNode]));
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=V;i++){
            if(distance[i] == Integer.MAX_VALUE){
                sb.append("INF").append("\n");
            } else{
                sb.append(distance[i]).append("\n");
            }
        }
    
        
        System.out.println(sb);
    }
    static class Node implements Comparable<Node> {
        int toNode;
        int e;

        @Override
        public int compareTo(Node o){
            return this.e - o.e;
        }

        public Node(int toNode, int e){
            this.toNode = toNode;
            this.e = e;
        }
    }
}