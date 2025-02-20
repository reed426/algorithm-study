import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String answer = "";
        char[] arr = (n+"").toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            answer+=arr[arr.length-i-1];
        }
        long result = Long.parseLong(answer);
        return result;
    }
}