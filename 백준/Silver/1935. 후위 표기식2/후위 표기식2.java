import java.io.*;
import java.util.*;


public class Main {
    static double result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        String expr = br.readLine();

        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> s = new Stack<>();

        for(char c: expr.toCharArray()){
            if(Character.isLetter(c)){
                s.push(arr[c-'A']);
            }else{
                double a = s.pop();
                double b = s.pop();

                switch (c){
                    case '+' :  s.push(a+b); break;
                    case '-' : s.push(b-a); break;
                    case '*' : s.push(a*b); break;
                    case '/' : s.push(b/a); break;
                }
            }
        }


       bw.write(String.format("%.2f",s.pop()));



        bw.flush();
        bw.close();
    }
}
