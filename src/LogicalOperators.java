public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 76;
        boolean isWarm = temperature > 7 && temperature < 102; // both needs to be true, to get true result
        System.out.println(isWarm);

        int temperature2 = 180;
        boolean isCold = temperature2 < 220 && temperature2 > 258; // java reads expressions from left to right; && - "and" Java operator
        System.out.println(isCold);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit; // vertical 2 lines (||) means "or"
        System.out.println(isEligible);

        boolean hasHighIncome1 = true;
        boolean hasGoodCredit1 = true;
        boolean hasCriminalRecord = false;
    boolean isEligible1 = (hasGoodCredit1 || hasHighIncome1) && !hasCriminalRecord; // "!" this sign means "no"
        System.out.println(isEligible1);


    }
}
