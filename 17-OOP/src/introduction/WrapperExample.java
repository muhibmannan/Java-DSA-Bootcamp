package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//

        Integer a = 10;
        Integer b = 20;

        System.out.println(a + " " + b);

        A obj = new A("adsfa");

        System.out.println(obj);
    }



}

class A {
    final int a = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}