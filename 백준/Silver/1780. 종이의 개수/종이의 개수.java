import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    static int[] cnt = new int[3];
    static int[][] arr ;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i=0;i<n;i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        divide(0,0,n);

        bw.write(cnt[0]+"\n");
        bw.write(cnt[1]+"\n");
        bw.write(cnt[2]+"\n");

        bw.flush();
        bw.close();

    }

    static void divide(int a, int b, int size){
       if(check(a,b,size)){
           cnt[arr[a][b]+1]++;
           return;
       }

       int newSize = size/3;

       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               divide(a+i*newSize,b+j*newSize,newSize);
           }
       }
    }


    static boolean check(int a, int b, int size){
        int value = arr[a][b];

        for(int i=a;i<a+size;i++){
            for(int j=b;j<b+size;j++){
                if(arr[i][j]!=value){
                    return false;
                }
            }
        }
        return true;
    }
}