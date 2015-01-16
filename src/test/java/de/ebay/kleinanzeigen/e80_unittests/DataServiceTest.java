package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.e80_unittests.support.ApiDataLoader;
import de.ebay.kleinanzeigen.e80_unittests.support.TriggeredAnimator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceTest {


    @Mock
    private ApiDataLoader dataService;

    @Test
    public void reloadsData() {
        when(dataService.loadDataFromApi()).thenReturn("first", "second");
        TriggeredAnimator animator = new TriggeredAnimator();

        DataService dataSer = new DataService(dataService, animator);

        assertThat(dataSer.getData()).isEqualTo("first");

        animator.
    }
}
