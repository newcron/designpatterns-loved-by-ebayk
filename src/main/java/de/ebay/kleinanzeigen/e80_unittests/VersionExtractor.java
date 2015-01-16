package de.ebay.kleinanzeigen.e80_unittests;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

class VersionExtractor implements ResponseHandler<String> {
    @Override
    public String handleResponse(HttpResponse httpResponse) throws IOException {
        return EntityUtils.toString(httpResponse.getEntity())
                .replaceAll("\\r?\\n", "")
                .replaceAll(".*<revision>", "")
                .replaceAll("</revision.*", "").trim();
    }
}
