package loop_string;

import java.util.Scanner;

// Write a program to make a digital tasbih where the program counts each time user press enter until press 0
public class program_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int point=0;
        System.out.println("Press enter button to start your zikr and press 0 to end your zikr");
        while (true){
            String input=scanner.nextLine();
            point++;
            if (input.equals("0")){
                System.out.println("Your zikr finished.");
                break;
            }
            System.out.println(point);
        }
    }
}
