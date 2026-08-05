import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] k = new int[speeds.length];
        
        for(int i=0; i<progresses.length; i++) {
            
            int j = 0; // 작업가능 날짜
            int sum = progresses[i];
            
            while(sum < 100) {
                j += 1;
                sum = progresses[i] + speeds[i] * j;
            }
            
            k[i] = j;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int day = k[0]; // 현재 배포 기준 날짜
        int count = 1; // 이번 배포에 포함되는 기능 수
        
        for(int i=1; i<k.length; i++) {
            if(k[i] <= day) {
                count += 1;
            }
            else {
                list.add(count);
                day = k[i];
                count = 1;
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}