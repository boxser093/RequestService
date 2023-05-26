package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
public class Counters {

    @JsonCreator
    public Counters(
            @JsonProperty("isFbw") boolean isFbw,
            @JsonProperty("isFbs") boolean isFbs,
            @JsonProperty("isDistribution") boolean isDistribution,
            @JsonProperty("isPickPoints") boolean isPickPoints,
            @JsonProperty("isService") boolean isService,
            @JsonProperty("total") boolean total
    ) {
        this.isFbw = isFbw;
        this.isFbs = isFbs;
        this.isDistribution = isDistribution;
        this.isPickPoints = isPickPoints;
        this.isService = isService;
        this.total = total;
    }

    @Setter
    @Getter
    boolean isFbw;
    @Setter
    @Getter
    boolean isFbs;
    @Setter
    @Getter
    boolean isDistribution;
    @Setter
    @Getter
    boolean isPickPoints;
    @Setter
    @Getter
    boolean isService;
    @Setter
    @Getter
    boolean total;
}
