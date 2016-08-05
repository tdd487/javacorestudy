import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by tdd on 2016/8/5.
 */
public class CalendarTest {
    public static void main(String args[]){
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        System.out.println(today+"----"+month);

    }
}
