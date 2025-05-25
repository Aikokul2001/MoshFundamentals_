import java.util.Scanner;

public class ExerciseFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Number: ");
        int number1 = scanner1.nextInt();
        if (number1 % 5 == 0 && number1 % 3 == 0) // % percent mark is used as / division
            System.out.println("FizzBuzz");
        else if (number1 % 3 == 0) {  // Java says do not repeat expression twice
            System.out.println("Bizz");
        } else if (number1 % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number1);

        Scanner scanner2 = new Scanner(System.in); // coding without repetition
        System.out.println("Number: ");
        int number2 = scanner2.nextInt();
        if (number2 % 5 == 0) {  // if the first condition
            if (number2 % 3 == 0) // if + the second condition
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");

        } else if (number2 % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number2);
        }

            
        }






