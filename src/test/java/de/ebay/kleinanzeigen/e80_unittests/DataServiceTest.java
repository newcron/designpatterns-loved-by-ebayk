package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.e80_unittests.support.ApiDataLoader;
import de.ebay.kleinanzeigen.e80_unittests.support.TriggeredAnimator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceTest {


    @Mock
    private ApiDataLoader dataLoader;
    private DataService dataService;
    private TriggeredAnimator animator;

    @Before
    public void setUp() {
        when(dataLoader.loadDataFromApi()).thenReturn("first", "second");

        animator = new TriggeredAnimator();

        dataService = new DataService(dataLoader, animator);
    }

    @Test
    public void loadsInitialData() {
        assertThat(dataService.getData()).isEqualTo("first");
    }

    @Test
    public void reloadsData() {
        animator.triggger();
        assertThat(dataService.getData()).isEqualTo("second");
    }
}
