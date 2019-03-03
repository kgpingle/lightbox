
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
    "viewport",
    "og:site_name",
    "og:type",
    "og:title",
    "og:url",
    "og:description",
    "twitter:description",
    "twitter:site",
    "twitter:image",
    "twitter:card",
    "og:image",
    "twitter:title",
    "msapplication-tilecolor",
    "msapplication-tileimage",
    "msapplication-config",
    "apple-mobile-web-app-capable",
    "apple-mobile-web-app-status-bar-style",
    "apple-mobile-web-app-title",
    "vicurrentdatetime",
    "msapplication-allowdomainmetatags",
    "msapplication-square150x150logo",
    "msapplication-square70x70logo",
    "msapplication-wide310x150logo",
    "referrer",
    "msvalidate.01",
    "fb:app_id",
    "og:locale",
    "twitter:creator",
    "apple-itunes-app",
    "theme-color",
    "pageid",
    "pagetype",
    "subpagetype",
    "title",
    "request_id"
})
public class Metatag {

    @JsonProperty("viewport")
    private String viewport;
    @JsonProperty("og:site_name")
    private String ogSiteName;
    @JsonProperty("og:type")
    private String ogType;
    @JsonProperty("og:title")
    private String ogTitle;
    @JsonProperty("og:url")
    private String ogUrl;
    @JsonProperty("og:description")
    private String ogDescription;
    @JsonProperty("twitter:description")
    private String twitterDescription;
    @JsonProperty("twitter:site")
    private String twitterSite;
    @JsonProperty("twitter:image")
    private String twitterImage;
    @JsonProperty("twitter:card")
    private String twitterCard;
    @JsonProperty("og:image")
    private String ogImage;
    @JsonProperty("twitter:title")
    private String twitterTitle;
    @JsonProperty("msapplication-tilecolor")
    private String msapplicationTilecolor;
    @JsonProperty("msapplication-tileimage")
    private String msapplicationTileimage;
    @JsonProperty("msapplication-config")
    private String msapplicationConfig;
    @JsonProperty("apple-mobile-web-app-capable")
    private String appleMobileWebAppCapable;
    @JsonProperty("apple-mobile-web-app-status-bar-style")
    private String appleMobileWebAppStatusBarStyle;
    @JsonProperty("apple-mobile-web-app-title")
    private String appleMobileWebAppTitle;
    @JsonProperty("vicurrentdatetime")
    private String vicurrentdatetime;
    @JsonProperty("msapplication-allowdomainmetatags")
    private String msapplicationAllowdomainmetatags;
    @JsonProperty("msapplication-square150x150logo")
    private String msapplicationSquare150x150logo;
    @JsonProperty("msapplication-square70x70logo")
    private String msapplicationSquare70x70logo;
    @JsonProperty("msapplication-wide310x150logo")
    private String msapplicationWide310x150logo;
    @JsonProperty("referrer")
    private String referrer;
    @JsonProperty("msvalidate.01")
    private String msvalidate01;
    @JsonProperty("fb:app_id")
    private String fbAppId;
    @JsonProperty("og:locale")
    private String ogLocale;
    @JsonProperty("twitter:creator")
    private String twitterCreator;
    @JsonProperty("apple-itunes-app")
    private String appleItunesApp;
    @JsonProperty("theme-color")
    private String themeColor;
    @JsonProperty("pageid")
    private String pageid;
    @JsonProperty("pagetype")
    private String pagetype;
    @JsonProperty("subpagetype")
    private String subpagetype;
    @JsonProperty("title")
    private String title;
    @JsonProperty("request_id")
    private String requestId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("viewport")
    public String getViewport() {
        return viewport;
    }

    @JsonProperty("viewport")
    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    @JsonProperty("og:site_name")
    public String getOgSiteName() {
        return ogSiteName;
    }

    @JsonProperty("og:site_name")
    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

    @JsonProperty("og:type")
    public String getOgType() {
        return ogType;
    }

    @JsonProperty("og:type")
    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    @JsonProperty("og:title")
    public String getOgTitle() {
        return ogTitle;
    }

    @JsonProperty("og:title")
    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    @JsonProperty("og:url")
    public String getOgUrl() {
        return ogUrl;
    }

    @JsonProperty("og:url")
    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    @JsonProperty("og:description")
    public String getOgDescription() {
        return ogDescription;
    }

    @JsonProperty("og:description")
    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    @JsonProperty("twitter:description")
    public String getTwitterDescription() {
        return twitterDescription;
    }

    @JsonProperty("twitter:description")
    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    @JsonProperty("twitter:site")
    public String getTwitterSite() {
        return twitterSite;
    }

    @JsonProperty("twitter:site")
    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    @JsonProperty("twitter:image")
    public String getTwitterImage() {
        return twitterImage;
    }

    @JsonProperty("twitter:image")
    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    @JsonProperty("twitter:card")
    public String getTwitterCard() {
        return twitterCard;
    }

    @JsonProperty("twitter:card")
    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    @JsonProperty("og:image")
    public String getOgImage() {
        return ogImage;
    }

    @JsonProperty("og:image")
    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    @JsonProperty("twitter:title")
    public String getTwitterTitle() {
        return twitterTitle;
    }

    @JsonProperty("twitter:title")
    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    @JsonProperty("msapplication-tilecolor")
    public String getMsapplicationTilecolor() {
        return msapplicationTilecolor;
    }

    @JsonProperty("msapplication-tilecolor")
    public void setMsapplicationTilecolor(String msapplicationTilecolor) {
        this.msapplicationTilecolor = msapplicationTilecolor;
    }

    @JsonProperty("msapplication-tileimage")
    public String getMsapplicationTileimage() {
        return msapplicationTileimage;
    }

    @JsonProperty("msapplication-tileimage")
    public void setMsapplicationTileimage(String msapplicationTileimage) {
        this.msapplicationTileimage = msapplicationTileimage;
    }

    @JsonProperty("msapplication-config")
    public String getMsapplicationConfig() {
        return msapplicationConfig;
    }

    @JsonProperty("msapplication-config")
    public void setMsapplicationConfig(String msapplicationConfig) {
        this.msapplicationConfig = msapplicationConfig;
    }

    @JsonProperty("apple-mobile-web-app-capable")
    public String getAppleMobileWebAppCapable() {
        return appleMobileWebAppCapable;
    }

    @JsonProperty("apple-mobile-web-app-capable")
    public void setAppleMobileWebAppCapable(String appleMobileWebAppCapable) {
        this.appleMobileWebAppCapable = appleMobileWebAppCapable;
    }

    @JsonProperty("apple-mobile-web-app-status-bar-style")
    public String getAppleMobileWebAppStatusBarStyle() {
        return appleMobileWebAppStatusBarStyle;
    }

    @JsonProperty("apple-mobile-web-app-status-bar-style")
    public void setAppleMobileWebAppStatusBarStyle(String appleMobileWebAppStatusBarStyle) {
        this.appleMobileWebAppStatusBarStyle = appleMobileWebAppStatusBarStyle;
    }

    @JsonProperty("apple-mobile-web-app-title")
    public String getAppleMobileWebAppTitle() {
        return appleMobileWebAppTitle;
    }

    @JsonProperty("apple-mobile-web-app-title")
    public void setAppleMobileWebAppTitle(String appleMobileWebAppTitle) {
        this.appleMobileWebAppTitle = appleMobileWebAppTitle;
    }

    @JsonProperty("vicurrentdatetime")
    public String getVicurrentdatetime() {
        return vicurrentdatetime;
    }

    @JsonProperty("vicurrentdatetime")
    public void setVicurrentdatetime(String vicurrentdatetime) {
        this.vicurrentdatetime = vicurrentdatetime;
    }

    @JsonProperty("msapplication-allowdomainmetatags")
    public String getMsapplicationAllowdomainmetatags() {
        return msapplicationAllowdomainmetatags;
    }

    @JsonProperty("msapplication-allowdomainmetatags")
    public void setMsapplicationAllowdomainmetatags(String msapplicationAllowdomainmetatags) {
        this.msapplicationAllowdomainmetatags = msapplicationAllowdomainmetatags;
    }

    @JsonProperty("msapplication-square150x150logo")
    public String getMsapplicationSquare150x150logo() {
        return msapplicationSquare150x150logo;
    }

    @JsonProperty("msapplication-square150x150logo")
    public void setMsapplicationSquare150x150logo(String msapplicationSquare150x150logo) {
        this.msapplicationSquare150x150logo = msapplicationSquare150x150logo;
    }

    @JsonProperty("msapplication-square70x70logo")
    public String getMsapplicationSquare70x70logo() {
        return msapplicationSquare70x70logo;
    }

    @JsonProperty("msapplication-square70x70logo")
    public void setMsapplicationSquare70x70logo(String msapplicationSquare70x70logo) {
        this.msapplicationSquare70x70logo = msapplicationSquare70x70logo;
    }

    @JsonProperty("msapplication-wide310x150logo")
    public String getMsapplicationWide310x150logo() {
        return msapplicationWide310x150logo;
    }

    @JsonProperty("msapplication-wide310x150logo")
    public void setMsapplicationWide310x150logo(String msapplicationWide310x150logo) {
        this.msapplicationWide310x150logo = msapplicationWide310x150logo;
    }

    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @JsonProperty("msvalidate.01")
    public String getMsvalidate01() {
        return msvalidate01;
    }

    @JsonProperty("msvalidate.01")
    public void setMsvalidate01(String msvalidate01) {
        this.msvalidate01 = msvalidate01;
    }

    @JsonProperty("fb:app_id")
    public String getFbAppId() {
        return fbAppId;
    }

    @JsonProperty("fb:app_id")
    public void setFbAppId(String fbAppId) {
        this.fbAppId = fbAppId;
    }

    @JsonProperty("og:locale")
    public String getOgLocale() {
        return ogLocale;
    }

    @JsonProperty("og:locale")
    public void setOgLocale(String ogLocale) {
        this.ogLocale = ogLocale;
    }

    @JsonProperty("twitter:creator")
    public String getTwitterCreator() {
        return twitterCreator;
    }

    @JsonProperty("twitter:creator")
    public void setTwitterCreator(String twitterCreator) {
        this.twitterCreator = twitterCreator;
    }

    @JsonProperty("apple-itunes-app")
    public String getAppleItunesApp() {
        return appleItunesApp;
    }

    @JsonProperty("apple-itunes-app")
    public void setAppleItunesApp(String appleItunesApp) {
        this.appleItunesApp = appleItunesApp;
    }

    @JsonProperty("theme-color")
    public String getThemeColor() {
        return themeColor;
    }

    @JsonProperty("theme-color")
    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    @JsonProperty("pageid")
    public String getPageid() {
        return pageid;
    }

    @JsonProperty("pageid")
    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    @JsonProperty("pagetype")
    public String getPagetype() {
        return pagetype;
    }

    @JsonProperty("pagetype")
    public void setPagetype(String pagetype) {
        this.pagetype = pagetype;
    }

    @JsonProperty("subpagetype")
    public String getSubpagetype() {
        return subpagetype;
    }

    @JsonProperty("subpagetype")
    public void setSubpagetype(String subpagetype) {
        this.subpagetype = subpagetype;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("request_id")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("request_id")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
