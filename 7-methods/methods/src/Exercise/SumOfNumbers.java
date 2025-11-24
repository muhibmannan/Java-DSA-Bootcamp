package Exercise;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = in.nextInt();

        System.out.println("Sum of Natural Number is: " + sumOfNumbers(num));
    }
    static int sumOfNumbers(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
