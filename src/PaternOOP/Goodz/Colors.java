package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Colors {
    String name;
    long id;
    public Colors(
            @JsonProperty("name") String name,
            @JsonProperty("id") long id
    ) {
        this.name = name;
        this.id = id;
    }
}
