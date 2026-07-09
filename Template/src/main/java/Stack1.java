import java.util.Deque;
import java.util.ArrayDeque;

public class Stack1 {
    public static void main(String[] args) {
        // Deque 인터페이스로 선언하고 ArrayDeque으로 생성
        Deque<Integer> stack = new ArrayDeque<>();

        // 데이터 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 맨 위 데이터 확인
        int top = stack.peek();
        System.out.println("Top: " + top);

        // 맨 위 데이터 제거
        int item = stack.pop();
        System.out.println("Removed: " + item);

        // 스택이 비었는지 확인
        boolean isEmpty = stack.isEmpty();
        System.out.println("Empty: " + isEmpty);

        // 스택이 빌 때까지 제거
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}