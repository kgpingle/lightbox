
package com.example.lightbox.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cse_thumbnail",
    "metatags",
    "cse_image",
    "breadcrumb",
    "videoobject",
    "aggregaterating"
})
public class Pagemap {

    @JsonProperty("cse_thumbnail")
    private List<CseThumbnail> cseThumbnail = null;
    @JsonProperty("metatags")
    private List<Metatag> metatags = null;
    @JsonProperty("cse_image")
    private List<CseImage> cseImage = null;
    @JsonProperty("breadcrumb")
    private List<Breadcrumb> breadcrumb = null;
    @JsonProperty("videoobject")
    private List<Videoobject> videoobject = null;
    @JsonProperty("aggregaterating")
    private List<Aggregaterating> aggregaterating = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cse_thumbnail")
    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    @JsonProperty("cse_thumbnail")
    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    @JsonProperty("metatags")
    public List<Metatag> getMetatags() {
        return metatags;
    }

    @JsonProperty("metatags")
    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    @JsonProperty("cse_image")
    public List<CseImage> getCseImage() {
        return cseImage;
    }

    @JsonProperty("cse_image")
    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    @JsonProperty("breadcrumb")
    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    @JsonProperty("breadcrumb")
    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    @JsonProperty("videoobject")
    public List<Videoobject> getVideoobject() {
        return videoobject;
    }

    @JsonProperty("videoobject")
    public void setVideoobject(List<Videoobject> videoobject) {
        this.videoobject = videoobject;
    }

    @JsonProperty("aggregaterating")
    public List<Aggregaterating> getAggregaterating() {
        return aggregaterating;
    }

    @JsonProperty("aggregaterating")
    public void setAggregaterating(List<Aggregaterating> aggregaterating) {
        this.aggregaterating = aggregaterating;
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
