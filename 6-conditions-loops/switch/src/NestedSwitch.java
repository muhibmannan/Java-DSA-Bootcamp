import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();



/*
        switch (empID) {
            case 1:
                System.out.println("John Doe");
                break;
            case 2:
                System.out.println("Johnny Appleseed");
                break;
            case 3:
                System.out.println("Muhib Mannan");

                String department = in.next();

                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Audit":
                        System.out.println("Financial Audit Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            default:
                System.out.println("Enter valid Employee ID");
        }
*/
        switch (empID) {
            case 1 -> System.out.println("John Doe");
            case 2 -> System.out.println("Johnny Appleseed");
            case 3 -> {
                System.out.println("Muhib Mannan");
                String department = in.next();
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Audit" -> System.out.println("Financial Audit Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter valid Employee ID");
        }
    }
}
