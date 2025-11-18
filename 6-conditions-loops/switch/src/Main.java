import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /* Switch Statement - Classic
        String fruit = in.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("An apple a day keeps the doctor away!");
                break;
            case "Orange":
                System.out.println("A healthy round fruit");
                break;
            case "grape":
                System.out.println("A royal delicacy");
                break;
            default:
                System.out.println("Please enter a valid fruit.");
        }
         */

        /* Switch Statement - NEW/ENHANCED

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("An apple a day keeps the doctor away!");
            case "Orange" -> System.out.println("A healthy round fruit");
            case "grape" -> System.out.println("A royal delicacy");
            default -> System.out.println("Please enter a valid fruit.");
        }*/


        int day = in.nextInt();

        /*
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }*/

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}