package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

@JsonAutoDetect

public class Stocks {
    String[] strings = {};
    List<String> namesWh = Arrays.asList(strings);
    int wh;
    long qty;
    long time1;
    long time2;

    public Stocks(
            @JsonProperty("wh") int wh,
            @JsonProperty("qty") long qty,
            @JsonProperty("time1") long time1,
            @JsonProperty("time2") long time2
    ) {
        this.wh = wh;
        this.qty = qty;
        this.time1 = time1;
        this.time2 = time2;
    }

}
