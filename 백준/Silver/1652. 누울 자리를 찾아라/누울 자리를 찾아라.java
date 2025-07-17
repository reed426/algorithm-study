import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int Rcnt;
    static int Ccnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] room = new char[n+1][n+1];

        for(int i=0;i<n;i++){
            String tmp = br.readLine();
            for(int j=0;j<n;j++){
                room[i][j] = tmp.charAt(j);
            }
        }

        Rcnt=0;
        Ccnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if((room[i][j]=='.' && room[i][j+1]=='.') && (room[i][j+2]=='X' || j+2==n)){
                    Rcnt++;
                }
            }
        }

        for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++){
                if((room[i][j]=='.' && room[i+1][j]=='.') && (room[i+2][j]=='X' || i+2==n)){
                    Ccnt++;
                }
            }
        }

       System.out.print(Rcnt+" "+Ccnt);
    }
}