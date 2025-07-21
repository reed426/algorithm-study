import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static char[] king, stone;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        king = st.nextToken().toCharArray();
        stone = st.nextToken().toCharArray();

        int n = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String motion = br.readLine();
            char[] nextKing = move(motion,king);

            if(nextKing[0]>='A' && nextKing[0]<='H'&& nextKing[1]>='1'&& nextKing[1]<='8') {
                if(nextKing[0] == stone[0] && nextKing[1] == stone[1]){
                    char[] nextStone = move(motion,stone);

                    if(nextStone[0]>='A' && nextStone[0]<='H' && nextStone[1]>='1'&& nextStone[1]<='8'){
                        king = nextKing;
                        stone = nextStone;
                    }
                }else{
                    king = nextKing;
                }
                
            }
            
        }
        System.out.println(king[0]+""+king[1]);
        System.out.println(stone[0]+""+stone[1]);
        
    }
    static char[] move(String tmp, char[] arr){
        char[] result = arr.clone();
        if (tmp.equals("R")) {
            result[0]++;
        } else if (tmp.equals("L")) {
            result[0]--;
        } else if (tmp.equals("B")) {
            result[1]--;
        } else if (tmp.equals("T")) {
            result[1]++;
        } else if (tmp.equals("RT")) {
            result[0]++; result[1]++;
        } else if (tmp.equals("LT")) {
            result[0]--; result[1]++;
        } else if (tmp.equals("RB")) {
            result[0]++; result[1]--;
        } else if (tmp.equals("LB")) {
            result[0]--; result[1]--;
        }
        return result;
    }
}