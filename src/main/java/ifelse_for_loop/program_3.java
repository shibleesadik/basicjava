package ifelse_for_loop;

import java.util.Scanner;

// Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
// If user inputs the correct summation, print "Answer is correct" and user will get 1 point.
// if user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown.
public class program_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int point=0;
        int max= 99;
        int min=10;
        for (int i=1; i<=5; i++) {
            double number_1 = Math.random()*(max-min)+min;
            int num_1= (int) number_1;
            double number_2 = Math.random()*(max-min)+min;
            int num_2= (int) number_2;
            int actual_sum = num_1+num_2;
            System.out.println("Question "+i+":\nWhat is the sum of "+num_1+" and "+num_2+"?");
            int user_input=scanner.nextInt();

            if (actual_sum == user_input){
                System.out.println("Your answer is correct.");
                point++;
            }
            else {
                System.out.println("Your answer is not correct.");
            }
        }
        System.out.println("Your total score is: "+point+ " out of 5");
    }
}
