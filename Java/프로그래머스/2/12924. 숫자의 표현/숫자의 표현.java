class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int start=1; start<=n; start++) {
            int sum = 0;
            
            for(int i=start; i<=n; i++) {
                sum = sum + i;
                
                if(sum == n) {
                    answer += 1;
                    break;
                }
                
                if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}