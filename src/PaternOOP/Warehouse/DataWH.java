package PaternOOP.Warehouse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonAutoDetect
public class DataWH {
    @Getter
    long id;
    @Getter
    long origid;
    @Getter
    String warehouse;
    @Getter
    @JsonIgnore
    String loadingSchedule;
    @Getter
    String workTime;
    @Getter
    String address;
    @Getter
    String latitude;
    @Getter
    String longitude;
    @Getter
    @JsonIgnore
    String gates;
    @JsonIgnore
    String passText;
    @JsonIgnore
    boolean isPassNeeded;
    @JsonIgnore
    long nearCityId;
    @JsonIgnore
    NearCity nearCity;
    long sortingTime;
    @JsonIgnore
    long deliveryPeriodInt;
    @JsonIgnore
    long deliveryPeriod;
    @JsonIgnore
    AvailGrade[] availGrade;
    @JsonIgnore
    Photos photos;
    @JsonIgnore
    boolean isFbw;
    @JsonIgnore
    boolean isFbwRestrictionCargo;
    @JsonIgnore
    boolean isFbs;
    @JsonIgnore
    boolean isFbsRestrictionCargo;
    @JsonIgnore
    boolean isDistribution;
    @JsonIgnore
    boolean isDistributionRestrictionCargo;
    @JsonIgnore
    boolean isPickPoints;
    @JsonIgnore
    boolean isPickPointsRestrictionCargo;
    @JsonIgnore
    boolean isService;
    @JsonIgnore
    boolean isServiceRestrictionCargo;
    @JsonIgnore
    String restrictions;
    @JsonIgnore
    boolean paidAcceptance;
    double rating;
    @JsonIgnore
    boolean isAcceptsQR;
    @JsonIgnore
    boolean isDontCheckDeliveryPeriod;
    @JsonIgnore
    boolean isDontCheckSortingTime;
    @JsonIgnore
    boolean paidAcceptanceOfSupply;
    @JsonIgnore
    boolean isDefaultPaidAcceptance;
    @JsonIgnore
    boolean isDefaultPaidAcceptanceOfSupply;

    @JsonCreator
    public DataWH(
            @JsonProperty("id") long id,
            @JsonProperty("origid") long origid,
            @JsonProperty("warehouse") String warehouse,
            @JsonProperty("loadingSchedule") String loadingSchedule,
            @JsonProperty("workTime") String workTime,
            @JsonProperty("address") String address,
            @JsonProperty("latitude") String latitude,
            @JsonProperty("longitude") String longitude,
            @JsonProperty("gates") String gates,
            @JsonProperty("passText") String passText,
            @JsonProperty("isPassNeeded") boolean isPassNeeded,
            @JsonProperty("nearCityId") long nearCityId,
            @JsonProperty("nearCity") NearCity nearCity,
            @JsonProperty("sortingTime") long sortingTime,
            @JsonProperty("deliveryPeriodInt") long deliveryPeriodInt,
            @JsonProperty("deliveryPeriod") long deliveryPeriod,
            @JsonProperty("availGrade") AvailGrade[] availGrade,
            @JsonProperty("photos") Photos photos,
            @JsonProperty("isFbw") boolean isFbw,
            @JsonProperty("isFbwRestrictionCargo") boolean isFbwRestrictionCargo,
            @JsonProperty("isFbs") boolean isFbs,
            @JsonProperty("isFbsRestrictionCargo") boolean isFbsRestrictionCargo,
            @JsonProperty("isDistribution") boolean isDistribution,
            @JsonProperty("isDistributionRestrictionCargo") boolean isDistributionRestrictionCargo,
            @JsonProperty("isPickPoints") boolean isPickPoints,
            @JsonProperty("isPickPointsRestrictionCargo") boolean isPickPointsRestrictionCargo,
            @JsonProperty("isService") boolean isService,
            @JsonProperty("isServiceRestrictionCargo") boolean isServiceRestrictionCargo,
            @JsonProperty("restrictions") String restrictions,
            @JsonProperty("paidAcceptance") boolean paidAcceptance,
            @JsonProperty("rating") double rating,
            @JsonProperty("isAcceptsQR") boolean isAcceptsQR,
            @JsonProperty("isDontCheckDeliveryPeriod") boolean isDontCheckDeliveryPeriod,
            @JsonProperty("isDontCheckSortingTime") boolean isDontCheckSortingTime,
            @JsonProperty("paidAcceptanceOfSupply") boolean paidAcceptanceOfSupply,
            @JsonProperty("isDefaultPaidAcceptance") boolean isDefaultPaidAcceptance,
            @JsonProperty("isDefaultPaidAcceptanceOfSupply") boolean isDefaultPaidAcceptanceOfSupply
    ) {
        this.id = id;
        this.origid = origid;
        this.warehouse = warehouse;
        this.loadingSchedule = loadingSchedule;
        this.workTime = workTime;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.gates = gates;
        this.passText = passText;
        this.isPassNeeded = isPassNeeded;
        this.nearCityId = nearCityId;
        this.nearCity = nearCity;
        this.sortingTime = sortingTime;
        this.deliveryPeriodInt = deliveryPeriodInt;
        this.deliveryPeriod = deliveryPeriod;
        this.availGrade = availGrade;
        this.photos = photos;
        this.isFbw = isFbw;
        this.isFbwRestrictionCargo = isFbwRestrictionCargo;
        this.isFbs = isFbs;
        this.isFbsRestrictionCargo = isFbsRestrictionCargo;
        this.isDistribution = isDistribution;
        this.isDistributionRestrictionCargo = isDistributionRestrictionCargo;
        this.isPickPoints = isPickPoints;
        this.isPickPointsRestrictionCargo = isPickPointsRestrictionCargo;
        this.isService = isService;
        this.isServiceRestrictionCargo = isServiceRestrictionCargo;
        this.restrictions = restrictions;
        this.paidAcceptance = paidAcceptance;
        this.rating = rating;
        this.isAcceptsQR = isAcceptsQR;
        this.isDontCheckDeliveryPeriod = isDontCheckDeliveryPeriod;
        this.isDontCheckSortingTime = isDontCheckSortingTime;
        this.paidAcceptanceOfSupply = paidAcceptanceOfSupply;
        this.isDefaultPaidAcceptance = isDefaultPaidAcceptance;
        this.isDefaultPaidAcceptanceOfSupply = isDefaultPaidAcceptanceOfSupply;
    }
}
