package PackageName;

import java.util.Calendar;

public class ShowTime {
    public static void main(String[] args) {
        int hour,min,sec,millisec,year,month,day;
        Calendar calendar=Calendar.getInstance();
        hour=calendar.get(calendar.HOUR_OF_DAY);
        min=calendar.get(calendar.MINUTE);
        sec=calendar.get(calendar.SECOND);
        millisec=calendar.get(calendar.MILLISECOND);
        year=calendar.get(calendar.YEAR);
        month=calendar.get(calendar.MONTH);
        day=calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+"时"+min+"分"+sec+"秒"+millisec);
    }
}