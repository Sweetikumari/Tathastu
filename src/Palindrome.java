//4. Write a Java program to find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is palindrome or not");
        int num = sc.nextInt();
        int temp= num;
        while(num>0){
            int r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}



