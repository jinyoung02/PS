import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int x = score.length/m;
        
        Arrays.sort(score);
        
        // 내림차순 정렬 먼저
        for(int i=0; i<score.length/2; i++) {
            int temp = score[i];
            score[i] = score[score.length-1-i];
            score[score.length-1-i] = temp;
        }
        
        for(int i=0; i<x; i++) {
            int[] p = new int[m];
            int z = 0;
            for(int j=0; j<m; j++) {
                p[j] = score[i*m+j];
            }
            // 낮은 점수찾기
            int low = p[0];
            for(int a=1; a<p.length; a++) {
                if(p[a]<low) {
                    low = p[a];
                }
            }
            z = low*m;
            answer = answer + z;
        }
        
        return answer;
    }
}