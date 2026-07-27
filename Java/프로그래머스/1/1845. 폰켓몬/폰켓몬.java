import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length/2;
        
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int k = nums[i];
            
            if(m.containsKey(k)) {
                m.put(k, m.get(k) + 1);
            }
            else {
                m.put(k, 1);
            }
        }
        
        if(m.size() >= N) {
            answer = N;
        }
        else {
            answer = m.size();
        }
        
        return answer;
    }
}