package Lessions;

public class Scope {
    public static void main(String[] args0) {
        int a = 10;
        int b = 20;
        System.out.println(a);

        String name = "John";
        System.out.println(name);
        {
//            int a = 78; // Already initialised outside the block, cannot initialise again

            a = 100; // BUT can reassign the original reference variable (in stack) to a different value (in heap).
            System.out.println(a);

            int c = 564;
            // values initialised in this block will remain in the block.

            name = "Muhib";
            System.out.println(name);
        }
        int c = 900;

        System.out.println(a);
//        System.out.println(c);  // cannot use outside the block.
        System.out.println(name);

        // == Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 546;
        System.out.println(num);
        System.out.println(marks);
    }
}
