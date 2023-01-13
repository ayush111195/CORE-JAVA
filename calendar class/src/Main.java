import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();// ye sayntax h calender ko call karne ka

        System.out.println(c.getTimeZone());
        System.out.println(c.getCalendarType());
        System.out.println(c.isLenient());
        System.out.println(c.get(Calendar.DATE)); // ye calendar se date find kane ke  leye use hoti h
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); // hour of day station wala tym btata h ....
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


        // GregorianCalender class--->>>

        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2990));
        System.out.println(cal.setWeek);

        // time zone--->>>

        System.out.println(TimeZone.getAvailableIDs(1));
        System.out.println(TimeZone.getDefault());
        System.out.println(TimeZone.getAvailableIDs());

    }
}
