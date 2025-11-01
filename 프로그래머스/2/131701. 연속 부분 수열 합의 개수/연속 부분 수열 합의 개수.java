import java.util.*;
class Solution {
    public int solution(int[] elements) {
        
        int n = elements.length;
        int[] doubled = new int[2*n];
        
        for(int i=0;i<n;i++){
            doubled[i] = elements[i];
            doubled[i+n] = elements[i];
        }
        
        int[] prefix = new int[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            prefix[i] = prefix[i - 1] + doubled[i - 1];
        }
        Set<Integer> sums = new HashSet<>();
        
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = prefix[start + len] - prefix[start];
                sums.add(sum);
            }
        }
        
        
        
       
        return sums.size();
    }
}