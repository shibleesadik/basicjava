package loop;

import java.util.Scanner;

// Write a program to sum of digits of a number by taking from user input
public class program_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long number= scanner.nextLong();
        long sum=0;
        while (number!=0){
            long rem= number%10;
            number=number/10;
            sum=sum+rem;
        }
        System.out.println("The sum of the digits of the given number is: "+sum);
    }
}
