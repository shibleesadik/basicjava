package conditionalStatement;
// 1. Write a program that takes a year from user and print whether that year is a leap year or not
import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a year: ");
        int year = scanner.nextInt();

        if (year % 400 ==0){
            System.out.println(year+" is a leap year.");
        }
        else if (year % 100 ==0){
            System.out.println(year+" is not a leap year.");
        }
        else if (year % 4 ==0){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
