package basic;
// Write a program to take 3 inputs from user and do sum and average
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer number:");
        int num1=scanner.nextInt();
        System.out.println("Input second integer number:");
        int num2=scanner.nextInt();
        System.out.println("Input third integer number:");
        int num3=scanner.nextInt();
        int sum=num1+num2+num3;
        int avg = sum/3;
        System.out.println("The sum of three numbers are "+sum+ ".");
        System.out.println("The average of three numbers are "+avg+ ".");
    }
}
