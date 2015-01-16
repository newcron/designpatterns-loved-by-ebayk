package de.ebay.kleinanzeigen.e80_unittests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceTest {


    @Mock
    private DataService dataService;

    @Test
    public void reloadsData() {
        when(dataService.getData()).thenReturn("first", "second");
        new DataService(dataService, )
    }
}
