package date_time_function_array;

import java.util.Scanner;

/*Write a program that will show minimum number of currency notes to sum of given amount. For example: You input an amount 1400.
The output will be:
        1000 1
        200 2
        Or you input the amount 165. The output will be:
        100 1
        50 1
        10 1
        5 1*/
public class program_6 {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount:");
        int amount = scanner.nextInt();
        int noteCount;
        for (int i = 0; i < notes.length; i++) {
            noteCount = amount / notes[i];
            amount = amount % notes[i];
            if (noteCount == 0) {
                continue;
            }
            System.out.println(notes[i]+" taka "+noteCount);
        }
    }
}
