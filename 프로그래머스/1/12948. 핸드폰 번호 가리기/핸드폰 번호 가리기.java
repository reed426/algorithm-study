class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int size= phone_number.length();
        char[] num = phone_number.toCharArray();
        
        for(int i=0;i<size;i++){
            if(i<size-4){
                answer+="*";
            }else{
                answer+=num[i];
            }
        }
        return answer;
    }
}