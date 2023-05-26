package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect
public class Params {
    String curr;
    long spp;
    long version;

    public Params(
            @JsonProperty("curr") String curr,
            @JsonProperty("spp") long spp,
            @JsonProperty("version") long version
    ) {
        this.curr = curr;
        this.spp = spp;
        this.version = version;
    }
}
