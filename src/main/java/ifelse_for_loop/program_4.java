package ifelse_for_loop;

import java.util.Scanner;

// Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance 2. Withdraw Money)
//Notes:
//1. If user inputs wrong PIN more than 3 times, following error should be shown: "You have entered wrong PIN more than 3 times. Card has blocked." and takes the valid PIN again
//2. If user inputs an amount that is not divisible by 500, then system should throw an error message as "Balance is not divisible by 500. Please try with another amount" and takes the valid input again
//3. If user inputs more than balance, then system should throw an error message as "Not enough balance. Please input valid amount" and takes the valid input again
public class program_4 {
    public static void main(String[] args) {
        double balance = 10000;
        int pin_number = 1234;
        Scanner scanner = new Scanner(System.in);
        System.out.println("For balance check press: 1 \nFor balance withdraw press: 2");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Please enter your pin number:");
                    int user_pin = scanner.nextInt();
                    if (user_pin == pin_number) {
                        System.out.println("Your account balance is " + balance + " taka.");
                        break;
                    } else {
                        System.out.println("Wrong pin number.");
                        count++;
                    }
                }
                if (count == 3) {
                    System.out.println("You have entered wrong pin number 3 times. Your card is blocked!");
                }
                break;

            case 2:
                count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Please enter your pin number");
                    int user_pin = scanner.nextInt();
                    if (user_pin == pin_number) {
                        System.out.println("Please enter your desired amount");
                        int amount_input = scanner.nextInt();
                        if (amount_input <= balance && amount_input % 500 == 0) {
                            balance -= amount_input;
                            System.out.println("Transaction successful. Your current balance is: " + balance + " taka");
                            break;
                        } else if (amount_input > balance) {
                            System.out.println("Amount more than your current balance.");
                        } else {
                            System.out.println("Please input amount which is multiply of 500 taka.");
                        }
                    } else {
                        System.out.println("Wrong pin number.");
                    }
                    count++;
                }
                if (count == 3) {
                    System.out.println("You have entered wrong pin number 3 times. Your card is blocked!");
                }
                break;

            default:
                System.out.println("Please select option 1 or 2");
        }
    }
}
