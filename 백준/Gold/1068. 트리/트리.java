import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,root,cnt;
    static int[] arr;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            list[i] =  new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if(parent == -1){
                root = i;
            }else{
                list[parent].add(i);
            }
        }
        int remove = Integer.parseInt(br.readLine());

        for (int i =0;i<n;i++){
            list[i].removeIf(node -> node==remove);
        }
        if(remove != root) DFS(root);

        System.out.println(cnt);
    }

    static void DFS(int v){
        if(list[v].isEmpty()){
            cnt++;
            return;
        }

        for(int child: list[v]){
            DFS(child);
        }
    }

}
