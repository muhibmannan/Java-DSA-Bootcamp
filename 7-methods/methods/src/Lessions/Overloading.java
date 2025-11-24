package Lessions;

public class Overloading {
    public static void main(String[] args) {
//        fun(231);
        fun("Muhib");
        fun(654, "Muhib");
        int ans = sum(2, 4);
        System.out.println(ans);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

    static void fun(int a, String name) {

    }


}
