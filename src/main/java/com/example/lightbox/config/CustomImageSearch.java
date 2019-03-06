package com.example.lightbox.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomImageSearch {

    @Value("${primary.api.key}")
    private String primaryApiKey;
    @Value("${primary.search.engine.id}")
    private String primarySearchEngineId;

    @Value("${secondary.api.key}")
    private String secondaryApiKey;
    @Value("${secondary.search.engine.id}")
    private String secondarySearchEngineId;

    @Value("${base.url}")
    private String baseUrl;

    public String getPrimaryApiKey() {
        return primaryApiKey;
    }

    public void setPrimaryApiKey(final String primaryApiKey) {
        this.primaryApiKey = primaryApiKey;
    }

    public String getPrimarySearchEngineId() {
        return primarySearchEngineId;
    }

    public void setPrimarySearchEngineId(final String primarySearchEngineId) {
        this.primarySearchEngineId = primarySearchEngineId;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getSecondaryApiKey() {
        return secondaryApiKey;
    }

    public void setSecondaryApiKey(String secondaryApiKey) {
        this.secondaryApiKey = secondaryApiKey;
    }

    public String getSecondarySearchEngineId() {
        return secondarySearchEngineId;
    }

    public void setSecondarySearchEngineId(String secondarySearchEngineId) {
        this.secondarySearchEngineId = secondarySearchEngineId;
    }
}
