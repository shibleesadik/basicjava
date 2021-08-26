package loop_string;

import java.util.Scanner;

// Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]
public class program_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number to see prime number series: ");
        int number= scanner.nextInt();
        int count=0;
        int i=2;
        while (i<=number){
            boolean flag=true;
            for (int j=2; j<=i/2; j++){
                if (i%j==0){
                    flag= false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Total number of prime number from 2 to "+number+" is: "+count);
    }
}
