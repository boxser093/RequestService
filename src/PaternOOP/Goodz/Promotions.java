package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Promotions {
    long promo;

    public Promotions(
            @JsonProperty("promo") long promo
    ) {
        this.promo = promo;
    }
}
