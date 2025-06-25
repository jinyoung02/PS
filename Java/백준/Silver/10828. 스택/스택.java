import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int N = k.nextInt();
        k.nextLine();

        int[] stack = new int[10000];
        int size = 0;

        for (int i = 0; i < N; i++) {
            String command = k.nextLine();

            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack[size] = num;
                size++;
            }

            else if (command.equals("pop")) {
                if (size == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[size - 1]);
                    size--;
                }
            }

            else if (command.equals("size")) {
                System.out.println(size);
            }

            else if (command.equals("empty")) {
                System.out.println(size == 0 ? 1 : 0);
            }

            else if (command.equals("top")) {
                if (size == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[size - 1]);
                }
            }
        }

        k.close();
    }
}
