public class Casting {
    public static void main(String[] args) {
       // Implicit casting
        // byte ^ short ^ int ^ long ^ float ^ double
        short x =10;
        int y = x+234;
        System.out.println(y);
        double z = 3.14;
        double u = 30+z;
        System.out.println(u);
        double p = 3.15;
        int l = (int)p +  34;
        System.out.println(l);
        String h = "25"; // here need to remember that it is not number, but text
        int g = Integer.parseInt(h) +25; // method to turn text into number
        System.out.println(g);
        String k = "3.12";
        double q = Double.parseDouble(k)+150-10; // here not Integer, but double
        System.out.println(q);




    }
}
