import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        int i = 0;

        Stack<Integer> s = new Stack<>();

        while(i<order.length) {
            if(box == order[i]) {
                answer += 1;
                box += 1;
                i += 1;
            }
            else if(!s.isEmpty() && s.peek() == order[i]) {
                s.pop();
                answer += 1;
                i += 1;
            }
            else {
                if(box>order.length) {
                    break;
                }

                s.push(box);
                box += 1;
            }
        }

        return answer;
    }
}