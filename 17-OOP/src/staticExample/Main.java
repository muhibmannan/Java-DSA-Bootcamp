package staticExample;

public class Main {
    public static void main(String[] args) {
        Human muhib = new Human(23, "Muhib", 2500, true);
        Human john = new Human(34, "John Doe", 2100, false);
        Human asdf = new Human(21, "asdf", 1000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }

    // This is dependent on objects
    static void fun() {
//        greeting(); // this cannot be used as it requires an instance but the function this is used in does not
//                    // depend on instance

        // Non-static functions cannot be accessed without referencing their instances in a static context

        // Hence, it is being reference here
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // We know that something which is not static, belongs to an object
    void greeting() {
        System.out.println("Hello world");
    }
}
