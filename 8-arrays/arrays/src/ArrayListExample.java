import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(2);
//        list.add(35);
//        list.add(114);
//        list.add(768);
//        list.add(654);

//        Input - set length
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

//        Continuous input - have to come out of the loop by pressing ctrl + d or x
        while(in.hasNextInt()) {
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
