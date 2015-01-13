package de.ebay.kleinanzeigen.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendarFactoryTest  {
    @Test
    public void parsesDateCorrectly() {
        Calendar calendar = CalendarFactory.asCalendar("2014-07-21T13:48:23");
        assertThat(new SimpleDateFormat("dd.MM.yyyy'T'HH:mm:ss").format(calendar.getTime())).isEqualToIgnoringCase("21.07.2014T13:48:23");
    }
}
