package date_time_function_array;

import java.util.Scanner;

// Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
//Given array is: {10,5,2,3,2,7,7,15,10}
//Input: User inputs 7
//Output: Position: 5
public class program_4 {
    public static void main(String[] args) {
        int[] givenNumbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        System.out.println(matchingPosition(7, givenNumbers));
    }

    public static int matchingPosition(int num, int[] givenNumbers) {
        for (int i = 0; i < givenNumbers.length; i++) {
            if (num == givenNumbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
