
package com.example.lightbox.converter;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ratingvalue",
    "bestrating",
    "ratingcount",
    "reviewcount"
})
public class Aggregaterating {

    @JsonProperty("ratingvalue")
    private String ratingvalue;
    @JsonProperty("bestrating")
    private String bestrating;
    @JsonProperty("ratingcount")
    private String ratingcount;
    @JsonProperty("reviewcount")
    private String reviewcount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ratingvalue")
    public String getRatingvalue() {
        return ratingvalue;
    }

    @JsonProperty("ratingvalue")
    public void setRatingvalue(String ratingvalue) {
        this.ratingvalue = ratingvalue;
    }

    @JsonProperty("bestrating")
    public String getBestrating() {
        return bestrating;
    }

    @JsonProperty("bestrating")
    public void setBestrating(String bestrating) {
        this.bestrating = bestrating;
    }

    @JsonProperty("ratingcount")
    public String getRatingcount() {
        return ratingcount;
    }

    @JsonProperty("ratingcount")
    public void setRatingcount(String ratingcount) {
        this.ratingcount = ratingcount;
    }

    @JsonProperty("reviewcount")
    public String getReviewcount() {
        return reviewcount;
    }

    @JsonProperty("reviewcount")
    public void setReviewcount(String reviewcount) {
        this.reviewcount = reviewcount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
