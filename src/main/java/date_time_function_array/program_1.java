package date_time_function_array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Find the date difference (year, day, hour, min, sec) between your birthdate and today
public class program_1 {
    public static void main(String[] args) throws ParseException {
        String birth_date = "11-03-1993 08:10:30 AM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        Date date = formatter.parse(birth_date);
        Date today_date = new Date();
        //System.out.println(date);
        long difference = today_date.getTime() - date.getTime();
        //String date2= formatter.format(difference);
        //System.out.println(date2);
        long year = difference / (1000l * 60 * 60 * 24 * 365);
        long day = difference / (1000 * 60 * 60 * 24) % 365;
        long hour = (difference / (1000 * 60 * 60)) % 24;
        long min = (difference / (1000 * 60)) % 60;
        long sec = (difference / 1000) % 60;
        System.out.println("Date difference (year, day, hour, min, sec) between my birthdate and today is:");
        System.out.println("Year: " + year);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + min);
        System.out.println("Second: " + sec);
    }
}
