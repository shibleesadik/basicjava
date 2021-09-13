package date_time_function_array;

import java.util.Arrays;
import java.util.Scanner;

// Find the second largest number from an array by user input using function
public class Program_2 {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];
        System.out.println("Enter 10 numbers and press enter each time:");
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int secondLargestNumber = numbers[numbers.length - 2];
        System.out.println("The second largest number in given input numbers is: " + secondLargestNumber);
    }
}
