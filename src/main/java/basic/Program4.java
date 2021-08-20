package basic;
// Write a program to generate random numbers from minimum range to maximum range by user input
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minimum number:");
        int min = scanner.nextInt();
        System.out.println("Please enter maximum number:");
        int max = scanner.nextInt();
        System.out.println("The random number is: "+(int)(Math.random()*(max-min)+min)+"");
    }
}
