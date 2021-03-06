
package com.zutorcid.Works;

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
    "external-id-type",
    "external-id-value",
    "external-id-url",
    "external-id-relationship"
})
public class ExternalId_ {

    @JsonProperty("external-id-type")
    private String externalIdType;
    @JsonProperty("external-id-value")
    private String externalIdValue;
    @JsonProperty("external-id-url")
    private ExternalIdUrl_ externalIdUrl;
    @JsonProperty("external-id-relationship")
    private String externalIdRelationship;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("external-id-type")
    public String getExternalIdType() {
        return externalIdType;
    }

    @JsonProperty("external-id-type")
    public void setExternalIdType(String externalIdType) {
        this.externalIdType = externalIdType;
    }

    @JsonProperty("external-id-value")
    public String getExternalIdValue() {
        return externalIdValue;
    }

    @JsonProperty("external-id-value")
    public void setExternalIdValue(String externalIdValue) {
        this.externalIdValue = externalIdValue;
    }

    @JsonProperty("external-id-url")
    public ExternalIdUrl_ getExternalIdUrl() {
        return externalIdUrl;
    }

    @JsonProperty("external-id-url")
    public void setExternalIdUrl(ExternalIdUrl_ externalIdUrl) {
        this.externalIdUrl = externalIdUrl;
    }

    @JsonProperty("external-id-relationship")
    public String getExternalIdRelationship() {
        return externalIdRelationship;
    }

    @JsonProperty("external-id-relationship")
    public void setExternalIdRelationship(String externalIdRelationship) {
        this.externalIdRelationship = externalIdRelationship;
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
