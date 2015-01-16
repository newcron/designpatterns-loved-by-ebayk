package de.ebay.kleinanzeigen.e80_unittests;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StardateTest  {


    @Test
    public void printsToday() {
        assertThat(new Stardate().currentDate()).isEqualTo("Stardate 11501.13");
    }


}
