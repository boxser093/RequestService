package PaternOOP.Warehouse;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class WarehouseIdName {
    long id;
    String name;

    public WarehouseIdName(long id, String name) {
        this.id = id;
        this.name = name;
    }

   private static WarehouseIdName[] list = {
            new WarehouseIdName(120762, "Электросталь"),
            new WarehouseIdName(117501, "Подольск"),
            new WarehouseIdName(507, "Коледино"),
            new WarehouseIdName(117986, "Казань"),
            new WarehouseIdName(205985, "Краснодар"),
            new WarehouseIdName(1733, "Екатеринбург"),
            new WarehouseIdName(117414, "Санкт-Петербург"),
            new WarehouseIdName(117419, "Новосибирск"),
            new WarehouseIdName(1193, "Хабаровск"),
            new WarehouseIdName(206348, "Тула (Алексин)"),
            new WarehouseIdName(204939, "204939"),
            new WarehouseIdName(206968, "Чехов"),
            new WarehouseIdName(205228, "Белая Дача"),
            new WarehouseIdName(208277, "Невинномысск"),
            new WarehouseIdName(208941, "Домодедово"),
            new WarehouseIdName(210515, "Вёшки"),
            new WarehouseIdName(211622, "Минск"),
            new WarehouseIdName(207743, "Пушкино"),
            new WarehouseIdName(218210, "Обухово")};

    public static List<WarehouseIdName> WH_LIST = Arrays.asList(list);
}
