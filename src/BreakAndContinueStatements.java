import java.util.Scanner;

public class BreakAndContinueStatements {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input1 = "";
        while (!input1.equals("exit")) {
            System.out.print("Input: ");
            input1 = scanner1.next().toLowerCase();
            if (input1.equals("exit")) {
                break;
            }
        }

    }

}
