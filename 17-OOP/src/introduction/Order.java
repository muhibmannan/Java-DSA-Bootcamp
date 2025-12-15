package introduction;

public class Order {
    // 1. The Blueprint Variable (The Field)
    int price;

    // 2. The Constructor (The Builder)
    // Notice the input is ALSO named "price".
    public Order(int price) {
        // "this.price" means the BLUEPRINT variable (Line 3).
        // "price" means the INPUT variable (Line 7).
        this.price = price;
    }

    public static void main(String[] args) {
        // 3. Build the Object
        Order myOrder = new Order(500);

        System.out.println("Order Price: " + myOrder.price);

    }
}