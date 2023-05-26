package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class Resp {
    @Getter
    @Setter
    DataWH[] dataWHS;
    @Getter
    @Setter
    @JsonIgnore
    Counters counters;
    @Getter
    @Setter
    @JsonIgnore
    Filters filters;
    @Getter
    @Setter
    @JsonIgnore
    Sort[] sort;
    @Getter
    @Setter
    @JsonIgnore
    OfficeType[] officeTypes;
    @Getter
    @Setter
    @JsonIgnore
    boolean error;
    @Getter
    @Setter
    @JsonIgnore
    String errorText;
    @Getter
    @Setter
    @JsonIgnore
    AdditionalErrors additionalErrors;

    public Resp(
            @JsonProperty("dataWHS") DataWH[] dataWHS,
            @JsonProperty("counters") Counters counters,
            @JsonProperty("filters") Filters filters,
            @JsonProperty("sort") Sort[] sort,
            @JsonProperty("officeTypes") OfficeType[] officeTypes,
            @JsonProperty("error") boolean error,
            @JsonProperty("errorText") String errorText,
            @JsonProperty("additionalErrors") AdditionalErrors additionalErrors
    ) {
        this.dataWHS = dataWHS;
        this.counters = counters;
        this.filters = filters;
        this.sort = sort;
        this.officeTypes = officeTypes;
        this.error = error;
        this.errorText = errorText;
        this.additionalErrors = additionalErrors;
    }
}
