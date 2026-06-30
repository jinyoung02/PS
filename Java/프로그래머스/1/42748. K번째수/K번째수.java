import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int a = 0; a<commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] p = new int[j - i + 1];
            int z = 0;
            
            // 배열 자르기
            for (int x = i - 1; x <j; x++) {
                p[z] = array[x];
                z = z + 1;
            }
            
            Arrays.sort(p);
            
            answer[a] = p[k-1];
        }
        return answer;
    }
}