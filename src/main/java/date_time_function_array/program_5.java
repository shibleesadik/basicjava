package date_time_function_array;

import java.util.HashMap;
import java.util.Random;

/*Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note
and each time generate 3 notes randomly and show their summation.
Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk*/
public class program_5 {
    public static void main(String[] args) {
        HashMap <Integer, Integer> notes= new HashMap<Integer, Integer>();
        notes.put(0,2);
        notes.put(1,5);
        notes.put(2,10);
        notes.put(3,20);
        notes.put(4,50);
        notes.put(5,100);
        notes.put(6,200);
        notes.put(7,500);
        notes.put(8,1000);

        Random random= new Random();
        int key1= random.nextInt(9);
        int key2= random.nextInt(9);
        int key3= random.nextInt(9);

        int note1= notes.get(key1);
        int note2= notes.get(key2);
        int note3= notes.get(key3);

        System.out.println(note1+" Tk");
        System.out.println(note2+" Tk");
        System.out.println(note3+" Tk");
        int total= note1+note2+note3;
        System.out.println("Total= "+total+ " Tk");
    }
}
