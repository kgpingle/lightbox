package com.example.lightbox.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomImageSearch {

    @Value("${api.key}")
    private String apiKey;
    @Value("${search.engine.id}")
    private String searchEngineId;
    @Value("${base.url}")
    private String baseUrl;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(final String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSearchEngineId() {
        return searchEngineId;
    }

    public void setSearchEngineId(final String searchEngineId) {
        this.searchEngineId = searchEngineId;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
