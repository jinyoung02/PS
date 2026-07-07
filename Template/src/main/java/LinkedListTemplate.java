import java.util.*;

public class LinkedListTemplate {
    // 직접 연결 리스트를 만들 때 사용하는 노드 클래스
    static class Node {
        int data;   // 노드에 저장할 값
        Node next;  // 다음 노드를 가리키는 참조

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // 직접 연결 리스트 만들기
        Node head = null;

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // 노드 연결
        head = node1;
        node1.next = node2;
        node2.next = node3;

        // head부터 시작해서 next를 따라가며 순회
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        // Deque: 양쪽에서 추가/삭제할 수 있는 자료구조
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10); // 앞에 추가
        deque.addLast(20);  // 뒤에 추가

        System.out.println(deque.peekFirst()); // 앞 값 확인
        System.out.println(deque.peekLast());  // 뒤 값 확인

        deque.removeFirst(); // 앞 값 제거
        deque.removeLast();  // 뒤 값 제거

        // Queue처럼 사용: 뒤로 넣고 앞에서 뺌
        Deque<Integer> queue = new LinkedList<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }

        // Stack처럼 사용: 뒤로 넣고 뒤에서 뺌
        Deque<Integer> stack = new LinkedList<>();

        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);

        while(!stack.isEmpty()) {
            System.out.println(stack.removeLast());
        }
    }
}