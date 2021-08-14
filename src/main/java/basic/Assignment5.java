package basic;
// Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("The solution of (a+b)^2 is: "+(int)(Math.pow(c,2))+"");
    }
}
