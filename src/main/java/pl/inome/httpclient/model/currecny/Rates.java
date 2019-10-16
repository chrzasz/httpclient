package pl.inome.httpclient.model.currecny;


import com.fasterxml.jackson.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PLN"
})
public class Rates {

    @JsonProperty("PLN")
    private BigDecimal pLN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PLN")
    public BigDecimal getPLN() {
        return pLN;
    }

    @JsonProperty("PLN")
    public void setPLN(BigDecimal pLN) {
        this.pLN = pLN;
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
