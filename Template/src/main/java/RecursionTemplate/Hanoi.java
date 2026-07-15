package RecursionTemplate;

public class Hanoi {
    public static void main(String[] args) {
        int n = 3;

        hanoi(n, 1, 3, 2);
    }

    // n개의 원판을 start에서 target으로 옮기기
    static void hanoi(int n, int start, int target, int temp) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + start + " to " + target);
            return;
        }

        hanoi(n - 1, start, temp, target);
        System.out.println("Move disk " + n + " from " + start + " to " + target);
        hanoi(n - 1, temp, target, start);
    }
}