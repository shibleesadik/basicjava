package loop;

import java.util.Scanner;

//Take a number as input from the user. Now write a program to show table of the given numbers. Output will be shown like this:-------------------------3
//10*1=10
//10*2=20
//10*3=20
//10*10=100
public class program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to see the number table:");
        int user_input = scanner.nextInt();
        System.out.println("The number table of "+user_input+" is:");
        for (int i = 1; i <= 10; i++) {
            int multiplication_result = user_input * i;
            System.out.println(user_input+"*"+i+"="+multiplication_result);
        }
    }
}
