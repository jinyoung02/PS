import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            System.out.println(s);
        }
    }
}