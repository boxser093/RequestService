package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class NearCity {
    @JsonCreator
    public NearCity(
            @JsonProperty("id") long id,
            @JsonProperty("title") String title
    ) {
        this.id = id;
        this.title = title;
    }

    @Setter
    @Getter
    long id;
    @Setter
    @Getter
    String title;
}
