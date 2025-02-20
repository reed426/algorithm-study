class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] arr = (x+"").toCharArray();
        int sum=0;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]-48;
        }
        System.out.println(sum);
        if(x%sum!=0){
            answer=false;
        }
        
        return answer;
    }
}