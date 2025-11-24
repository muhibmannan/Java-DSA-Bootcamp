package Lessions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,3,4,657,25,5);
        multiple(1,3,"Muhib", "John", "Johnny");
        demo(2, 74, 87, 897);
        demo("Muhib", "John", "Johnny");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple (int a, int b, String ...v) {
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
