import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [] [] [] numbers = new int[2][3][4];
        numbers [0] [0][0] =1;
        System.out.println(Arrays.deepToString(numbers));
        int [][] numbersSecond = {{1,2,3,}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbersSecond));

    }
}
