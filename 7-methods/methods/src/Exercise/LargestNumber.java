package Exercise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = in.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = in.nextInt();

        int ans = largest(firstNumber, secondNumber, thirdNumber);
        System.out.println("The largest number is: " + ans);
    }

    static int largest(int first, int second, int third) {
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        } return largest;
    }
}
