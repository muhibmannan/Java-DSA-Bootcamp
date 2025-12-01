import java.util.ArrayList;
import java.util.Scanner;

public class AddingGrade {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> student = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            student.add(new ArrayList<>());
        }

        student.get(0).add(90);
        student.get(0).add(80);
        student.get(1).add(50);

        System.out.println(student);
    }
}
