import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);

            if(check(str)) {
                answer += 1;
            }
        }

        return answer;
    }

    public boolean check(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if(c == ')' && top != '(') {
                    return false;
                }
                else if(c == ']' && top != '[') {
                    return false;
                }
                else if(c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}