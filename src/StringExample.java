public class StringExample {
    public static void main(String[] args) {
        java.lang.String message = "   Hello   World" + "!!";
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("H", "B" ));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("o"));
        System.out.println(message.indexOf("A"));
        System.out.println(message.indexOf("o"));
        System.out.println(message.indexOf("W"));
        System.out.println(message.replace("ll", "tt"));
        System.out.println(message.replace("W", "B"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());



    }
}
