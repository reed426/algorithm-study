import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int num;
    static int bingo[][] = new int[5][5];
    static Map<Integer, int[]> xy = new HashMap<>();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                int value = Integer.parseInt(st.nextToken());
                bingo[i][j] = value;
                xy.put(value,new int[]{i,j});
            }
        }

        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                int tmp = Integer.parseInt(st.nextToken());
                cnt++;

                if(xy.containsKey(tmp)){
                    int[] pos = xy.get(tmp);
                    bingo[pos[0]][pos[1]] = -1;
                }

                check();
                 if(num >=3){
                    System.out.println(cnt);
                    return;     
                    }
                }
            }
        }    
    
    public static void check(){
        num = 0;
        int row, col;
        int lDia = 0;
        int rDia = 0; 
        for(int i=0;i<5;i++){
            row = 0;
            col = 0;
            for(int j=0;j<5;j++){
                row+=bingo[i][j];
                col+=bingo[j][i];
                if(i==j) lDia+=bingo[i][j];
                if(i+j==4){
                    rDia += bingo[i][j];
                }
                if(row==-5) num++;
                if(col==-5) num++;
            }
            if(lDia==-5) num++; 
            if(rDia==-5) num++;
        }
    }
}