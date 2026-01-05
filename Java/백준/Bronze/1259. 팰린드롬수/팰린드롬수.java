import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String y = "yes";
        String n = "no";

        Scanner input = new Scanner(System.in);

        while (true) {

            int x = input.nextInt();
            if (x == 0) {
                break;
            }

            String s = String.valueOf(x);
            boolean check = true;

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(y);
            } else {
                System.out.println(n);
            }
        }
    }
}
