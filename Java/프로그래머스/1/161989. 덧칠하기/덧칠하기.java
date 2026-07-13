class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 마지막 페인트칠
        int painted = 0;
        
        for(int i=0; i<section.length; i++) {
            if(section[i] > painted) {
                answer = answer + 1;
                painted = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}