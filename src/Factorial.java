//3. Write a Java program to calculate a Factorial of a number.
public class Factorial {

    public static int factorial(int n) {

        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
