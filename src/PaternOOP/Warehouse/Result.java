package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class Result {
    @Getter
    @Setter
    Resp resp;

    @JsonCreator
    public Result(
            @JsonProperty("resp") Resp resp
    ) {
        this.resp = resp;
    }
}
