package PaternOOP.Goodz;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect

public class Product {
    @Getter
    @Setter
    long id;
    @Getter
    @Setter
    long root;
    @Getter
    @Setter
    long kindId;
    @Getter
    @Setter
    long subjectId;
    @Getter
    @Setter
    long subjectParentId;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    String brand;
    @Getter
    @Setter
    long brandId;
    @Getter
    @Setter
    long siteBrandId;
    @Getter
    @Setter
    long supplierId;
    @Getter
    @Setter
    Number sale;
    @Getter
    @Setter
    Number priceU;
    @Getter
    @Setter
    Number salePriceU;
    @Getter
    @Setter
    Number logisticsCost;
    @Getter
    @Setter
    Extended extended;
    @Getter
    @Setter
    Number saleConditions;
    @Getter
    @Setter
    long pics;
    @Getter
    @Setter
    double rating;
    @Getter
    @Setter
    long feedbacks;
    @Getter
    @Setter
    long panelPromoId;
    @Getter
    @Setter
    String promoTextCard;
    @Getter
    @Setter
    String promoTextCat;
    @Getter
    @Setter
    long volume;
    @Getter
    @Setter
    Colors[] colors;
    @Getter
    @Setter
    Promotions[] promotions;
    @Getter
    @Setter

    @JsonIgnore
    Sizes[] sizes;
    @Getter
    @Setter
    boolean diffPrice;
    @Getter
    @Setter
    long time1;
    @Getter
    @Setter
    long time2;
    @Getter
    @Setter
    long wh;
    @Getter
    @Setter
    long qty;

    @JsonIgnore
    String origName;
    @JsonIgnore
    long rank;
    @JsonIgnore
    long optionId;
    @JsonIgnore
    String sign;


    @JsonCreator
    public Product(
            @JsonProperty("id") long id,
            @JsonProperty("root") long root,
            @JsonProperty("kindId") long kindId,
            @JsonProperty("subjectId") long subjectId,
            @JsonProperty("subjectParentId") long subjectParentId,
            @JsonProperty("name") String name,
            @JsonProperty("brand") String brand,
            @JsonProperty("brandId") long brandId,
            @JsonProperty("siteBrandId") long siteBrandId,
            @JsonProperty("supplierId") long supplierId,
            @JsonProperty("sale") Number sale,
            @JsonProperty("priceU") Number priceU,
            @JsonProperty("salePriceU") Number salePriceU,
            @JsonProperty("logisticsCost") Number logisticsCost,
            @JsonProperty("extended") Extended extended,
            @JsonProperty("saleConditions") Number saleConditions,
            @JsonProperty("pics") long pics,
            @JsonProperty("rating") double rating,
            @JsonProperty("feedbacks") long feedbacks,
            @JsonProperty("panelPromoId") long panelPromoId,
            @JsonProperty("promoTextCard") String promoTextCard,
            @JsonProperty("promoTextCat") String promoTextCat,
            @JsonProperty("volume") long volume,
            @JsonProperty("colors") Colors[] colors,
            @JsonProperty("promotions") Promotions[] promotions,
            @JsonProperty("sizes") Sizes[] sizes,
            @JsonProperty("diffPrice") boolean diffPrice,
            @JsonProperty("time1") long time1,
            @JsonProperty("time2") long time2,
            @JsonProperty("wh") long wh,
            @JsonProperty("qty") long qty,
            @JsonProperty("origName") String origName,
            @JsonProperty("rank") long rank,
            @JsonProperty("optionId") long optionId,
            @JsonProperty("sign")String sign


    ) {

        this.id = id;
        this.root = root;
        this.kindId = kindId;
        this.subjectId = subjectId;
        this.subjectParentId = subjectParentId;
        this.name = name;
        this.brand = brand;
        this.brandId = brandId;
        this.siteBrandId = siteBrandId;
        this.supplierId = supplierId;
        this.sale = sale;
        this.priceU = priceU;
        this.salePriceU = salePriceU;
        this.logisticsCost = logisticsCost;
        this.extended = extended;
        this.saleConditions = saleConditions;
        this.pics = pics;
        this.rating = rating;
        this.feedbacks = feedbacks;
        this.panelPromoId = panelPromoId;
        this.promoTextCard = promoTextCard;
        this.promoTextCat = promoTextCat;
        this.volume = volume;
        this.colors = colors;
        this.promotions = promotions;
        this.sizes = sizes;
        this.diffPrice = diffPrice;
        this.time1 = time1;
        this.time2 = time2;
        this.wh = wh;
        this.qty = qty;
    }
}
