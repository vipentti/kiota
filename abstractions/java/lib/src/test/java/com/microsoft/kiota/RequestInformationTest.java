/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.microsoft.kiota;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RequestInformationTest {
    @Test
    void setsRawUri() throws URISyntaxException {
        final var requestInfo = new RequestInformation();
        requestInfo.setUri(new URI("https://graph.microsoft.com/test"));
        assertEquals("https://graph.microsoft.com/test", requestInfo.getUri().toString());
    }
    @Test
    void setsQueryParameters() throws URISyntaxException {
        final var requestInfo = new RequestInformation();
        requestInfo.urlTemplate = "https://graph.microsoft.com/test{?select,expand}";
        requestInfo.queryParameters.put("select", Arrays.asList("id", "displayName"));
        assertEquals("https://graph.microsoft.com/test?select=id,displayName", requestInfo.getUri().toString());
    }
}
