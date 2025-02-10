import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]? o1[1]-o2[1]: o1[0]-o2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            if(!pq.isEmpty()){

                if(pq.peek()<=arr[i][0]){
                    pq.poll();
                    pq.add(arr[i][1]);
                }
                else{
                    pq.add(arr[i][1]);

                }
            }else{
                pq.add(arr[i][1]);
            }
        }
        bw.write(pq.size()+"");
        bw.flush();
    }
}





