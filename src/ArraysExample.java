import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [] numbers = new int[25];
        numbers [0] =1;
        numbers [1] = 2;
        numbers [24]= 32;
        System.out.println(Arrays.toString(numbers));

        int [] numbersSecond = {3, 3, 4, 6, 6, 7, 9};
        System.out.println(numbersSecond.length);
        Arrays.sort(numbersSecond);
        System.out.println(Arrays.toString(numbersSecond));



    }

}
