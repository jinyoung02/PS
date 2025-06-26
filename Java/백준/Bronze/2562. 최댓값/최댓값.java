import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] k = new int[9];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            k[i] = sc.nextInt();
        }

        int max = k[0];
        int index = 1;

        for (int i = 1; i < 9; i++) {
            if (max < k[i]) {
                max = k[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
