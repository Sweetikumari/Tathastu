//2. Write a Java program to calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void fibonacci(int n){
        int sum=0;

        System.out.print(0+" ");
        System.out.print(1+" ");
        int n1 = 0;
        int n2 = 1;
        for(int i=2; i<n; i++) {
            sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
            sum = 0;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        fibonacci(n);

    }
}
