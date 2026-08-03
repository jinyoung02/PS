import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> m = new HashMap<>();

        for(int i=0; i<want.length; i++) {
            m.put(want[i], number[i]);
        }
        
        for(int i=0; i<=discount.length-10; i++) {
            Map<String, Integer> d = new HashMap<>();
            
            for(int j=i; j<i+10; j++){
                String item = discount[j];
                
                if(d.containsKey(item)) {
                    d.put(item, d.get(item) + 1);
                }
                else {
                    d.put(item, 1);
                }
            }
            
            if(m.equals(d)) {
                answer += 1;
            }
        }

        return answer;
    }
}