import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            // with while loops we check the condition first
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        do {
            // with Do while loops, we check the condition last
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);

        } while (input.equals("quit"));
    }
}
