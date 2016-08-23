import java.text.DateFormatSymbols;
import java.util.*;

import static java.util.Calendar.*;

/**
 * @version 1.4 2007-04-07
 * @author Cay Horstmann
 */

public class CalendarTest
{
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(DAY_OF_MONTH);
        int month = gc.get(MONTH);//MONTH从零开始
        month +=1;
        int year = gc.get(YEAR);
        System.out.println(year+"年"+month+"月"+today+"日");
        gc.set(Calendar.DAY_OF_MONTH,1);
        int weekday = gc.get(Calendar.DAY_OF_WEEK);
        System.out.println("weekday:"+weekday);
        int firstDayOfWeek = gc.getFirstDayOfWeek();
        System.out.println("firstDayOfWeek:"+firstDayOfWeek);
    }
}
