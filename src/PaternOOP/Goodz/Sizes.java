package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect
public class Sizes {
    String name;
    @JsonIgnore
    String origName;
    @JsonIgnore
    long rank;
    @JsonIgnore
    long optionId;
    Stocks[] stocks;
    long time1;
    long time2;
    long wh;
    String sign;

    public Sizes(
            @JsonProperty("name")String name,
            @JsonProperty("origName")String origName,
            @JsonProperty("rank")long rank,
            @JsonProperty("optionId")long optionId,
            @JsonProperty("stocks")Stocks[] stocks,
            @JsonProperty("time1")long time1,
            @JsonProperty("time2")long time2,
            @JsonProperty("wh")long wh,
            @JsonProperty("sign") String sign
    ){
        this.name = name;
        this.origName = origName;
        this.rank = rank;
        this.optionId = optionId;
        this.stocks = stocks;
        this.time1 = time1;
        this.time2 = time2;
        this.wh = wh;
        this.sign = sign;
    }
}
