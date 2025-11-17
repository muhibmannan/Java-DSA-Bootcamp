package com.muhib;

import java.util.Scanner;

public class Calculator {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        // ** Step 1 - Take input from user until user presses X or x **
        System.out.print("Enter the operator: ");

        int result = 0;

        while(true){
            // ** Step 2 - Take the operator input **
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                //Step 3 - Input two numbers
                System.out.print("Enter the first number: ");
                int firstNumber = input.nextInt();
                System.out.print("Enter the second number: ");
                int secondNumber = input.nextInt();

                // ** Step 4 - Perform the calculation
                if (operator == '+'){
                    result = firstNumber + secondNumber;
                }
                if (operator == '-'){
                    result = firstNumber - secondNumber;
                }
                if (operator == '*'){
                    result = firstNumber * secondNumber;
                }
                if (operator == '/'){
                    if (secondNumber != 0){
                        result = firstNumber / secondNumber ;
                    }
                }
                if (operator == '%'){
                    result = firstNumber % secondNumber;
                }

                System.out.println("The answer is: " + result);

            } else if ( operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
