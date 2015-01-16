package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.e80_unittests.support.Clock;
import de.ebay.kleinanzeigen.e80_unittests.support.SystemTimeClock;

import java.util.Calendar;

class Stardate {

    private final Clock clock;

    public Stardate() {
        this(new SystemTimeClock());
    }

    Stardate(Clock clock) {
        this.clock = clock;
    }

    public String currentDate() {

        Calendar now = clock.now();

        int stardateYear = now.get(Calendar.YEAR) - 1900;
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        return String.format("Stardate %d%02d.%02d", stardateYear, month, day);
    }
}
