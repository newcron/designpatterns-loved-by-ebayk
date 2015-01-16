package de.ebay.kleinanzeigen.e80_unittests;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

class ApiCaller {

    private final CloseableHttpClient client;

    public ApiCaller() {
        this(HttpClientBuilder.create().build());
    }

    ApiCaller(CloseableHttpClient client) {
        this.client = client;
    }

    public boolean checkVersionIs(String expectedVersion) throws IOException {

        String version = client.execute(new HttpGet("http://kleinanzeigen.ebay.de/anzeigen/release-info"), new VersionExtractor());

        return version.equals(expectedVersion);
    }

}
