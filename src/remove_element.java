//9. Write a Java program to remove elements from an ArrayList
import java.util.ArrayList;
import java.util.List;

public class remove_element {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1);
        a.add(2);


        System.out.println(a);
        a.remove(1);
        a.remove(1);

        System.out.println(a);
    }
}
