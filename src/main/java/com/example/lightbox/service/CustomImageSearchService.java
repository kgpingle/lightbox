package com.example.lightbox.service;

import com.example.lightbox.config.CustomImageSearch;
import com.example.lightbox.converter.CustomSearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

@Service
public class CustomImageSearchService {

    @Autowired private CustomImageSearch customImageSearch;
    private final ObjectMapper MAPPER = new ObjectMapper();

    public CustomSearchResult getSearchResults(final String query) throws IOException {

        final HttpURLConnection conn = getHttpURLConnection(query);
        final InputStreamReader in = new InputStreamReader((conn.getInputStream()));
        final CustomSearchResult report = parseResponse(in);
        conn.disconnect();
        return report;
    }

    private HttpURLConnection getHttpURLConnection(final String query) throws IOException {
        final HttpURLConnection conn = (HttpURLConnection) generateUrl(query).openConnection();
        setHeaders(conn);
        return conn;
    }

    private CustomSearchResult parseResponse(final InputStreamReader in) throws IOException {
        return MAPPER.readValue(in, CustomSearchResult.class);
    }

    private void setHeaders(final HttpURLConnection conn) throws ProtocolException {
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
    }



    private URL generateUrl(final String query) throws MalformedURLException, UnsupportedEncodingException {

        final StringBuilder url = new StringBuilder(customImageSearch.getBaseUrl());
        url.append("key=").append(customImageSearch.getApiKey());
        url.append("&cx=").append(customImageSearch.getSearchEngineId());
        url.append("&alt=json");
        url.append("&q=").append(URLEncoder.encode(query, "UTF-8"));

        return new URL(url.toString());
    }
}
