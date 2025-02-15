package Day16;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Solution {

    public static void main(String[] args) {

        System.out.println(findDay(2,15,2025));
        LocalDate localDate = LocalDate.of(2025,2,15);
        System.out.println(localDate.getDayOfWeek().toString());
    }

    public static String findDay(int month, int day, int year) {
        Calendar calender = Calendar.getInstance();
        calender.set(year,month-1,day);
        int d = calender.get(Calendar.DAY_OF_WEEK);
        switch (d) {
            case Calendar.SUNDAY: return "SUNDAY";
            case Calendar.MONDAY: return "MONDAY";
            case Calendar.TUESDAY: return "TUESDAY";
            case Calendar.WEDNESDAY: return "WEDNESDAY";
            case Calendar.THURSDAY: return "THURSDAY";
            case Calendar.FRIDAY: return "FRIDAY";
            case Calendar.SATURDAY: return "SATURDAY";
        }

        return null;
    }
}