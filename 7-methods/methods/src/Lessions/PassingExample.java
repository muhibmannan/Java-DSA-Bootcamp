package Lessions;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "Rahul Rana";
    }
}
