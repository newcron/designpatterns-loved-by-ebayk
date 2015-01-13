package de.ebay.kleinanzeigen.e80_unittests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

class ApiCaller {

    boolean checkVersionIs(String expectedVersion) throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(new HttpGet("http://kleinanzeigen.ebay.de/anzeigen/release-info"));
        String version = EntityUtils.toString(response.getEntity())
                .replaceAll("\\r?\\n", "")
                .replaceAll(".*<revision>", "")
                .replaceAll("</revision.*", "").trim();

        return version.equals(expectedVersion);
    }


    public static void main(String...args) throws IOException {
        System.out.println(new ApiCaller().checkVersionIs("2817-d15afbd"));

    }
}
