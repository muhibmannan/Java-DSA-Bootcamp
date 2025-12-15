package staticExample;


public class InnerClass {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Muhib");
        Test b = new Test("John");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
