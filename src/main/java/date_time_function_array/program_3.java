package date_time_function_array;

import java.util.Arrays;

// Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
//Output: 2, 7, 10
public class program_3 {
    public static void main(String[] args) {
        int[] num={10,5,2,3,2,7,7,15,10};
        duplicateFinder(num);
    }

    public static void duplicateFinder(int numbers[]){
        for (int i=0; i<=numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[i]==numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
