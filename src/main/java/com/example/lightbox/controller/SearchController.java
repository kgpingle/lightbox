package com.example.lightbox.controller;

import com.example.lightbox.converter.CustomSearchResult;
import com.example.lightbox.service.CustomImageSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SearchController {

    @Autowired CustomImageSearchService customImageSearchService;
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public CustomSearchResult search(@RequestParam(value="query") final String query) throws IOException {
        return customImageSearchService.getSearchResults(query);
    }
}
