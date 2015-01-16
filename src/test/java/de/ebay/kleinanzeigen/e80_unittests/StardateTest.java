package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.util.CalendarFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StardateTest {


    @Test
    public void printsToday() {
        assertThat(new Stardate(
                () -> CalendarFactory.asCalendar("2015-01-13T09:12:11")
        ).currentDate()).isEqualTo("Stardate 11501.13");
    }


}
