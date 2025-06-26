import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i;
        int j;
        for (i = 1; i <= N; i++) {
            for(j=N-i; j>0; j--){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
