//5. Write a Java program to calculate Permutation and Combination of 2 numbers.
import java.util.ArrayList;
import java.util.List;

//5. Write a Java program to calculate Permutation and Combination of 2 numbers.
public class Permutation_combination {
   public static int fact(int number) {
       int f = 1;
       int j = 1;
       while (j <= number) {
           f = f * j;
           j++;
       }
       return f;
   }
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<Integer>();

            numbers.add(5);
            numbers.add(12);
            numbers.add(9);
            numbers.add(78);
            numbers.add(55);

            int n = numbers.size();
            int r = 3;
            int result1;
            int result2;

            result1 = fact(n) / (fact(r) * fact(n-r));
            System.out.println("The combination value for the numbers list is: " + result1);

            result2 = fact(n) / fact(n-r);
            System.out.println("The permutation value for the numbers list is: " + result2);

        }
}
