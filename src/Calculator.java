//1. Write a Java program to perform basic Calculator operations.
public class Calculator{
    public static void sum(float a, float b) {
        System.out.println("sum of two numbers are: "+(a+b));
    }

    public static void difference(float a, float b) {
        System.out.println("difference of two numbers are: "+(a-b));
    }

    public static void product(float a, float b) {
        System.out.println("product of two numbers are: "+(a*b));
    }

    public static void division(float a, float b) {
        System.out.println("division of two numbers are: "+(a/b));
    }
    public static void main(String[] args) {
        float a = 8.0f;
        float b = 7.0f;

        sum(a, b);
        difference(a, b);
        product(a, b);
        division(a, b);

    }
}
