import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] p = new int[10];
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int k = A * B * C;
        String s = String.valueOf(k);

        for (int i = 0; i < s.length(); i++) {
            int q = Integer.parseInt(String.valueOf(s.charAt(i)));
            p[q]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(p[i]);
        }
    }
}
