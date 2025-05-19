public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F); // rounds
        System.out.println(result);
        int secondResult = (int)Math.ceil(7.9D); // ceil returns int, which equal or bigger then input number;
        System.out.println(secondResult);
        int thirdResult = (int)Math.floor(34.58D); // the contrary of ceil - returns int, which is equal or less then input number;
        System.out.println(thirdResult);
        int forthResult = (int)Math.ceil(569.5D);
        System.out.println(forthResult);
        int fifth = (int)Math.floor(788.2D);
        System.out.println(fifth);
        int sixth = (int)Math.round(865.2569);
        System.out.println(sixth);
        int seventh = Math.max(158,485);
        System.out.println(seventh);
        int eighth = Math.min(15, 65);
        System.out.println(eighth);
        double ninth = Math.random()*8900;
        System.out.println(ninth);
        double tenth = Math.round(Math.random()*900);
        System.out.println(tenth);
        int eleventh = (int)Math.round(Math.random()*900);
        System.out.println(eleventh);
        int twelve = (int)(Math.random()*100);
        System.out.println(twelve);
        System.out.println(twelve);








    }
}
