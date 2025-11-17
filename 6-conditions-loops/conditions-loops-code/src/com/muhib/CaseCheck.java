package com.muhib;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = input.next().trim().charAt(0);

        String msg = " ";
        if (character >= 'a' && character <= 'z') {
            msg = "Lowercase";
        } else {
            msg = "Uppercase";
        }
        System.out.println(msg);
    }
}