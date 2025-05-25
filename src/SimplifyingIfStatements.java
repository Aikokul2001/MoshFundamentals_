public class SimplifyingIfStatements {
    public static void main(String[] args) {
        String enteredPassword = "1234";   // first code was just to understand boolean with usage if, else
        String correctPassword = "1234";

        boolean isPasswordCorrect = enteredPassword.equals(correctPassword);

        if (isPasswordCorrect) {
            System.out.println("Access provided");
        } else {
            System.out.println("Password is incorrect");
        }
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        System.out.println(hasHighIncome);

        int income1 = 20_000;
        boolean hasHighIncome1 = (income1 > 100_000); // if this boolean expression evaluates to true, it will be true. Otherwise, false.
        System.out.println(hasHighIncome1);
        System.out.println();








    }


}
