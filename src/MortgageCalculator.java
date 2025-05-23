import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / percent / months_in_year;
        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * months_in_year;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments) / Math.pow(1+monthlyInterest, numberOfPayments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);











    }
}
