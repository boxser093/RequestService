package PaternOOP.Goodz;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Extended {
    Number basicSale;
    Number basicPriceU;
    Number clientSale;
    Number clientPriceU;

    public Extended(
            @JsonProperty("basicSale")Number basicSale,
            @JsonProperty("basicPriceU")Number basicPriceU,
            @JsonProperty("clientSale")Number clientSale,
            @JsonProperty("clientPriceU")Number clientPriceU
    ) {
        this.basicSale = basicSale;
        this.basicPriceU = basicPriceU;
        this.clientSale = clientSale;
        this.clientPriceU = clientPriceU;
    }
}
