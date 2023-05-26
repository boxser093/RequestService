package PaternOOP.Query;

import PaternOOP.Goodz.Data;
import PaternOOP.Goodz.Params;
import PaternOOP.Goodz.ResponseProducts;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class ResponseQuery extends ResponseProducts {
    @JsonIgnore
    Metadata metadata;

    @JsonCreator
    public ResponseQuery(
            @JsonProperty("state")long state,
            @JsonProperty("version")long version,
            @JsonProperty("params")Params params,
            @JsonProperty("data")Data data,
            @JsonProperty("metadata")Metadata metadata){
        super(state, version, params, data);
        this.metadata=metadata;
    }
}
