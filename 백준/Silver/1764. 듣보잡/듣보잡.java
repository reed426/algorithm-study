import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> listen = new HashSet<>();
        
        ArrayList<String> result= new ArrayList<>();
        for(int i=0;i<n;i++){
            listen.add(br.readLine());
        }
        for(int j=0;j<m;j++){
            String tmp = br.readLine();
            if(listen.contains(tmp)){
                result.add(tmp);
            }
        }
        
        Collections.sort(result);
        bw.write(result.size() +"\n");
        
        for(String s : result){
            bw.write(s);
            bw.write("\n");
        }
        
        
        bw.flush();

        
        
    }
}