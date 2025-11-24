package Exercise;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = in.nextInt();

        System.out.print("Grade: " + grade(marks));
    }

    static String grade(int a) {
        if (a >= 91 && a <= 100) {
            return "AA";
        } else if (a >= 81 && a <= 90) {
            return "AB";
        } else if (a >= 71 && a <= 80) {
            return "BB";
        } else if (a >= 61 && a <= 70) {
            return "BC";
        } else if (a >= 51 && a <= 60) {
            return "CD";
        } else if (a >= 41 && a <= 50) {
            return "DD";
        } else
            return "Fail";
    }
}
