package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
@JsonAutoDetect
public class Data {
    Product[] products;

    public Data(
            @JsonProperty("products") Product[] products) {
        this.products = products;
    }
}

