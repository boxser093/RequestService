package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
@JsonAutoDetect
public class ResponseProducts {

    public ResponseProducts(
            @JsonProperty("state")long state,
            @JsonProperty("version")long version,
            @JsonProperty("params")Params params,
               @JsonProperty("data")Data data) {
        this.state = state;
        this.version = version;
        this.params = params;
        this.data = data;
    }

    long state;
    long version;
    Params params;
    Data data;
}
