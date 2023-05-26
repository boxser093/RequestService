package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class ResponseWH {
    @Getter
    @Setter
    String id;
    @Getter
    @Setter
    String jsonrpc;
    @Getter
    @Setter
    Result result;

    @JsonCreator
    public ResponseWH(
            @JsonProperty("id") String id,
            @JsonProperty("jsonrpc") String jsonrpc,
            @JsonProperty("result") Result result
    ) {
        this.id = id;
        this.jsonrpc = jsonrpc;
        this.result = result;
    }
}
