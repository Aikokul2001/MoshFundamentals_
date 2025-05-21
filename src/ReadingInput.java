
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age =  scanner.nextByte();
        System.out.println("You are " + age);
        Scanner scanner2 = new Scanner(System.in);
        byte price = scanner2.nextByte();
        System.out.println("The price is "+ price);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Age:");
        byte age1 = scanner1.nextByte();
        System.out.println("You are "+age1);
        Scanner scanner3 = new Scanner(System.in);
        float price1 = scanner3.nextFloat();
        System.out.println("Price is "+ price1);
        Scanner scanner4 = new Scanner (System.in);
        System.out.println("Name: ");
        String name = scanner4.next();
        System.out.println("You are " + name);
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Name: ");
        String name2 = scanner5.nextLine(); // to make appear both first and last names
        System.out.println("Your name is "+ name2);
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name3 = scanner6.nextLine().trim(); // combining multiple methods
        System.out.println("Your name is "+ name3);






    }
}
