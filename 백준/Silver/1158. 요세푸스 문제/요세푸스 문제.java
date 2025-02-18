import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> arr = new LinkedList<>();
        for(int i=0;i<N;i++){
            arr.add(i+1);
        }
        bw.write('<');
        while(!arr.isEmpty()){
            for(int i=0;i<K;i++){
                if(i==K-1){
                    int a = arr.remove();
                    if(arr.size()==0){
                        bw.write(a+"");
                    }else{
                        bw.write(a+", ");
                    }
                }else{
                   arr.add(arr.remove());
                }

            }
        }
        bw.write('>');
        bw.flush();



    }



}

