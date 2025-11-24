package Exercise;

import java.util.Scanner;

public class VotingEligibilityCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = in.nextInt();
        
        isEligible(age);

        if (isEligible(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible.");
        }
    }

    private static boolean isEligible(int num) {
        return num >= 18;
    }
}