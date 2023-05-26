package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class Filters {
    @Getter
    @Setter
    boolean isViewAcceptsQR;
    @Getter
    @Setter
    Field[] fields;

    @JsonCreator
    public Filters(
            @JsonProperty("isViewAcceptsQR") boolean isViewAcceptsQR,
            @JsonProperty("fields") Field[] fields
    ) {
        this.isViewAcceptsQR = isViewAcceptsQR;
        this.fields = fields;
    }
}
