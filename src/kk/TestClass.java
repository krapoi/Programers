package programers;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestClass {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        Calendar calendar = Calendar.getInstance(Locale.KOREA);
        calendar.add(Calendar.DATE, 0);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, 0);
        System.out.println(decimalFormat.format(calendar.get(Calendar.DAY_OF_MONTH)));
        System.out.println(decimalFormat.format(calendar.get(Calendar.MONTH)));
        System.out.println(decimalFormat.format(calendar.get(Calendar.YEAR)));
    }
}
