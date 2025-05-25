import java.util.Scanner;

public class WhileLoop { // while loops are good in usage when we do not know how many times we want to repeat something
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ="";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
