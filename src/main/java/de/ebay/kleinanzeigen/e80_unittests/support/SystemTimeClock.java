package de.ebay.kleinanzeigen.e80_unittests.support;

import de.ebay.kleinanzeigen.e80_unittests.support.Clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SystemTimeClock implements Clock {
    @Override
    public Calendar now() {
        return new GregorianCalendar();
    }
}
