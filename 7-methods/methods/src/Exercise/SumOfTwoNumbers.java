package Exercise;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();
        
        int answer = sum(firstNumber, secondNumber);

        System.out.println("The sum is: " + answer);
    }

    static int sum(int a, int b) {
        return a + b;
    }


}
