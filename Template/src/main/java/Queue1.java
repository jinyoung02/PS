import java.util.Queue;
import java.util.ArrayDeque;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // 데이터 삽입
        q.offer(1);
        q.offer(2);
        q.offer(3);

        // 맨 앞 데이터 확인
        int front = q.peek();
        System.out.println("Front: " + front);

        // 맨 앞 데이터 제거
        int item = q.poll();
        System.out.println("Removed: " + item);

        // 큐가 비었는지 확인
        boolean isEmpty = q.isEmpty();
        System.out.println("Empty: " + isEmpty);

        // 큐가 빌 때까지 제거
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}