public class IfStatement {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) { // code block {} to add another message
            System.out.println("It is hot day");
            System.out.println("Drink plenty of water");


        } else if (temp > 20 && temp <= 32) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }


        int creditScore = 500;
        boolean hasCriminalRecord = false;
        if (creditScore > 750 && !hasCriminalRecord) {
            System.out.println("Eligible");
        }
        else if (creditScore < 750 || hasCriminalRecord) {
            System.out.println("Not Eligible");
        }

           else {
            System.out.println("Further review needed");
            System.out.println();
            System.out.println();

        }

    }
}
