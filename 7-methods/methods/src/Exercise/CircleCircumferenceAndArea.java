package Exercise;

import java.util.Scanner;

public class CircleCircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = in.nextInt();

        System.out.println("The area of the circle is: " + circumference(radius));
        System.out.println("The circumference of the circle is: " + area(radius));

    }

    static float circumference (int a) {
        return (float) (2 * Math.PI * a);
    }

    static float area(int b) {
        return (float) (Math.PI * (b * b));
    }
}
