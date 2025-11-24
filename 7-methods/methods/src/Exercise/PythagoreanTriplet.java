package Exercise;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = in.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = in.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = in.nextInt();

        System.out.println(isPythagorean(firstNum, secondNum, thirdNum));
    }

    static String isPythagorean(int a, int b, int c) {
        int largest = a;
        int num1 = b;
        int num2 = c;
        if (b > largest) {
            largest = b;
            num1 = a;
            num2 = c;
        }
        if (c > largest) {
            largest = c;
            num1 = a;
            num2 = b;
        }

        int sum = (num1 * num1) + (num2 * num2);
        int sqLargest = largest * largest;

        if (sqLargest == sum) {
            return "Pythagorean Triplet!";
        } else {
            return "Not a Pythagorean triplet.";
        }
    }
}
