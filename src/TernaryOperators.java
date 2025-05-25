public class TernaryOperators {
    public static void main(String[] args) {
        int income = 120_000;
        String className;
        if (income > 100_000)
            className = "First";
        else
            className = "Economy";
        System.out.println(className);

        int income1 = 120_000;
        String className1 = "Economy"; // we assume that they are in Economy class
        if (income > 100_000)  // and then we check this condition, if the condition is true then put in First class
            className1 = "First";
        System.out.println(className1);

        int income2 = 120_000;
        String className2 = income2 > 180_000 ? "First" : "Economy";
        // Ternary Operator "?" means if the condition is true, ":" means otherwise
        System.out.println(className2);

        int age = 45;
        String message = age >= 18 ? "Adult" : "Minor";
        System.out.println(message);

    }
}
