package PaternOOP.Query;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonAutoDetect
public class Metadata {
    String name;
    String catalog_type;
    String catalog_value;

    @JsonCreator
    public Metadata(
            @JsonProperty("name") String name,
            @JsonProperty("catalog_type") String catalog_type,
            @JsonProperty("catalog_value")String catalog_value) {
        this.name = name;
        this.catalog_type = catalog_type;
        this.catalog_value = catalog_value;
    }
}
