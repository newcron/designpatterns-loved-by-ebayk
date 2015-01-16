package de.ebay.kleinanzeigen.e80_unittests;

import com.google.common.base.Charsets;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VersionExtractorTest {

    @Mock
    private HttpResponse httpResponse;

    @Test
    public void extractsVersion() throws IOException {
        when(httpResponse.getEntity()).thenReturn(new StringEntity("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><release-info><codeline>(no branch)</codeline><revision>2878-3c438</revision><build-time>2015-01-16T09:38</build-time></release-info>", Charsets.UTF_8));

        assertThat(new VersionExtractor().handleResponse(httpResponse)).isEqualTo("2878-3c438");

    }
}


