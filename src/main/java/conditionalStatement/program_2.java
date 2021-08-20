package conditionalStatement;

import java.util.Scanner;

// Write a program to calculate CGPA and find grade from 4 subjects
public class program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpa=0;
        double total_gpa=0;
        for(int i=1;i<=4;i++){
            System.out.println("Input subject "+i+" mark:");
            int mark=scanner.nextInt();

            if (mark>=80 && mark<=100){
                gpa=4.00;
            }
            else if (mark>=75 && mark<=79){
                gpa=3.75;
            }
            else if (mark>=70 && mark<=74){
                gpa=3.50;
            }
            else if (mark>=65 && mark<=69){
                gpa=3.25;
            }
            else if (mark>=60 && mark<=64){
                gpa=3.00;
            }
            else if (mark>=55 && mark<=59){
                gpa=2.75;
            }
            else if (mark>=50 && mark<=54){
                gpa=2.50;
            }
            else if (mark>=45 && mark<=49){
                gpa=2.25;
            }
            else if (mark>=40 && mark<=44){
                gpa=2.00;
            }
            else {
                gpa=0.00;
            }
            total_gpa +=gpa;
            System.out.println("The GPA of subject "+i+ " is: "+gpa);
        }
        double cgpa = total_gpa/4;
        System.out.println("The CGPA of the student is: "+cgpa);
    }
}
