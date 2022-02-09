//6. Write a program in Java to print Diamond Pattern.
import java.util.Scanner;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            if (spaces > i) {
                spaces = spaces - 1;
                stars = stars + 2;
            }
            if (spaces < i) {
                spaces = spaces + 1;
                stars = stars - 2;
            }
            System.out.println();
        }
    }
}