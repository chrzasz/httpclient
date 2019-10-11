package pl.inome.httpclient.client;
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
        "ip",
        "city",
        "region",
        "region_code",
        "country",
        "country_name",
        "continent_code",
        "in_eu",
        "postal",
        "latitude",
        "longitude",
        "timezone",
        "utc_offset",
        "country_calling_code",
        "currency",
        "languages",
        "asn",
        "org"
})
public class IpDetails {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("city")
    private String city;
    @JsonProperty("region")
    private String region;
    @JsonProperty("region_code")
    private String regionCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("continent_code")
    private String continentCode;
    @JsonProperty("in_eu")
    private Boolean inEu;
    @JsonProperty("postal")
    private String postal;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("country_calling_code")
    private String countryCallingCode;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("languages")
    private String languages;
    @JsonProperty("asn")
    private String asn;
    @JsonProperty("org")
    private String org;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("region_code")
    public String getRegionCode() {
        return regionCode;
    }

    @JsonProperty("region_code")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("continent_code")
    public String getContinentCode() {
        return continentCode;
    }

    @JsonProperty("continent_code")
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    @JsonProperty("in_eu")
    public Boolean getInEu() {
        return inEu;
    }

    @JsonProperty("in_eu")
    public void setInEu(Boolean inEu) {
        this.inEu = inEu;
    }

    @JsonProperty("postal")
    public String getPostal() {
        return postal;
    }

    @JsonProperty("postal")
    public void setPostal(String postal) {
        this.postal = postal;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("utc_offset")
    public String getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("country_calling_code")
    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    @JsonProperty("country_calling_code")
    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("languages")
    public String getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @JsonProperty("asn")
    public String getAsn() {
        return asn;
    }

    @JsonProperty("asn")
    public void setAsn(String asn) {
        this.asn = asn;
    }

    @JsonProperty("org")
    public String getOrg() {
        return org;
    }

    @JsonProperty("org")
    public void setOrg(String org) {
        this.org = org;
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
