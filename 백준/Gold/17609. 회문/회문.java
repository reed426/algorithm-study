import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for(int i = 0;i<n;i++){
            String s = br.readLine();
            int answer = checkPalindrome(s);
            result.append(answer).append('\n');
        }
        bw.write(result.toString());
        bw.flush();
    }

    private static int checkPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                if(isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1)) {
                    return 1;
                }else{
                    return 2;
                }
            }
            left++;
            right--;
        }
        return 0;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
