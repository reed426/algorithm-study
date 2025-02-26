import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    static char[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st;
        while((st = br.readLine())!=null) {
            int n = Integer.parseInt(st);
            int num = (int)Math.pow(3,n);
            arr = new char[num];
            Arrays.fill(arr,'-');

           canto(0,arr.length);
           bw.write(String.copyValueOf(arr)+"\n");

           bw.flush();
        }
    }
    public static void canto(int start, int end){
        if(end-start<2){
            return;
        }

        int div_length = (end-start)/3;
        for(int i=start+div_length;i<end-div_length;i++){
            arr[i] = ' ';
        }
        canto(start,start+div_length);
        canto(start+div_length*2,end);

    }



}