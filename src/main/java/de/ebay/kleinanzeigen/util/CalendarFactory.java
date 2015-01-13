package de.ebay.kleinanzeigen.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarFactory {

    public static Calendar asCalendar(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            Date parse = sdf.parse(date);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(parse);
            return calendar;
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
