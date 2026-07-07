import java.util.*;

public class LinkedList {
    static class Node {
        int data;
        Node next;

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

        head = node1;
        node1.next = node2;
        node2.next = node3;

        // 연결 리스트 순회
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();


        // Deque 사용
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addLast(20);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.removeFirst();
        deque.removeLast();


        // 큐처럼 사용
        Deque<Integer> queue = new LinkedList<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }


        // 스택처럼 사용
        Deque<Integer> stack = new LinkedList<>();

        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);

        while(!stack.isEmpty()) {
            System.out.println(stack.removeLast());
        }
    }
}