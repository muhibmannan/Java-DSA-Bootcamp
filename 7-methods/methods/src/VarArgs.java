import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,3,4,657,25,5);
        multiple(1,3,"Muhib", "John", "Johnny");
    }

    static void multiple (int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
