import javax.management.StringValueExp;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)  // (initialization; condition; update)
            System.out.println("Kasha is ready");
        for (int y = 5; y > 0; y--) // y-- becomes less to 1 after each
            System.out.println("Wait for 5 seconds");

        for (int t = 1; t <= 7; t++)
            System.out.println("I love you " + t);

        for (int u = 0; u <= 20; u++)
            if (u % 2 == 0)
                System.out.println(u);

        int sum = 0;
        for (int l = 0; l <= 100; l++) {
            sum += l;
        }
        System.out.println("Sum of the number from 0 to 100: " + sum);
        int number = 5;  // число, для которого мы строим таблицу

        for (int p = 1; p <= 10; p++) {
            int result = number * p;
            System.out.println(number + " x " + p + " = " + result);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("n!:");
        int number2 = scanner.nextInt();
        int factorial = 1;
        for (int e=1; e<=number2;e++) {
            factorial *= e;
        }
            System.out.println(number2 + "= " + factorial);
    }


    }