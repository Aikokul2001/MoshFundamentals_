import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345768.891);
        System.out.println(result);
        NumberFormat secondCurrency = NumberFormat.getCurrencyInstance();
        String result2 = currency.format(8974546.258);
        System.out.println(result2);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result3 = percent.format(0.5554);
        System.out.println(result3);
        NumberFormat percent2 = NumberFormat.getPercentInstance();
        String result4 = percent.format(0.859);
        System.out.println(result4);
        String result5 = NumberFormat.getPercentInstance().format(0.285); // two methods are combined in one line
        System.out.println(result5);

    }

}
