package loop;

import java.util.Scanner;

// Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]
public class program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to see prime number list:");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
