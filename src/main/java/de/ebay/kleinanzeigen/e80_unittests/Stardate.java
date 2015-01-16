package de.ebay.kleinanzeigen.e80_unittests;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Stardate {


    public String currentDate() {

        Calendar now = new GregorianCalendar();

        int stardateYear = now.get(Calendar.YEAR) - 1900;
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        return String.format("Stardate %d%02d.%02d", stardateYear, month, day);
    }
}
