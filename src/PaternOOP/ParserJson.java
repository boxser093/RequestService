package PaternOOP;


import PaternOOP.Goodz.Data;
import PaternOOP.Goodz.Product;
import PaternOOP.Goodz.ResponseProducts;
import PaternOOP.Warehouse.DataWH;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ParserJson {
    public static String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3NJRCI6IjAyNTMxNTA5LWZiYTItNDdkNy1hNTI1LTllNTA5YjQ5YzUxMiJ9.KmzC5UkSygn1xSHOFxywKvIxbmeSp9ap6CGsVX78WVc";
    public static String URL_PARS_QTY = "https://card.wb.ru/cards/detail?appType=1&curr=rub&dest=12358048&regions=80,64,38,4,115,83,33,68,70,69,30,86,40,1,66,48,110,31,22,114&spp=20&nm=";
    public static String URL_QUERY = "https://search.wb.ru/exactmatch/ru/male/v4/search?resultset=catalog&appType=1&curr=rub&dest=12358048&regions=80,64,38,4,115,83,33,68,70,69,30,86,40,1,66,48,110,31,22,114&spp=20&query=";
    public static String ALL_CATALOG = "https://catalog.wb.ru/sellers/catalog?appType=1&curr=rub&dest=12358048&regions=80,64,38,4,115,83,33,68,70,69,30,86,40,1,66,48,110,31,22,114&sort=popular&spp=20&supplier=188687";
    public static String BRAND_RUCOMF = "светильник лофт";
    public static String BRAND_LAPERLE = "La Perle";

    public static void main(String[] args) {


//        List<Product> allProductsSupplier = getAllProductsSupplier();
//        setQtyforAll(allProductsSupplier);
//
//        for (Product product: allProductsSupplier){
//            System.out.println(product.getName()+" Остатки: "+product.getQty());
//        }
        String key = "торшер напольный";
        List<Product> search = searchQuery(key, 6);
        for (int i = 0; i < search.size(); i++) {
            if (search.get(i).getBrand().equalsIgnoreCase(BRAND_RUCOMF))
                System.out.println(search.get(i).getName()+" арт:"+ search.get(i).getId() + " " + " место в выдаче: #" + ++i + ", по ключу: " + "'" + key + "'" + " среди " + search.size() + " мест");
//            else {
//                System.out.println("В первые " + search.size()+ " не входит!");
//            }
        }
    }


    public static void setQtyforAll(List<Product> allProduct) {
        for (int i = 0; i < allProduct.size(); i++) {
            String art = String.valueOf(allProduct.get(i).getId());
            List<Product> products = getGoodzData(URL_PARS_QTY, art);
            for (Product line : products) {
                allProduct.get(i).setQty(allProduct.get(i).getQty() + line.getQty());
            }
        }
    }

    private static boolean chectId(long wh, long id) {
        if (wh == id) return true;
        return false;
    }


    public static List<Product> getAllProductsSupplier() {
//        String total = "";
        int i = 0;
        try {
            List<Product> result = new ArrayList<>();
            while (i < 7) {
                String urls = "https://catalog.wb.ru/sellers/catalog?appType=1&curr=rub&dest=12358048&page=" + ++i + "&regions=80,64,38,4,115,83,33,68,70,69,30,86,40,1,66,48,110,31,22,114&sort=popular&spp=20&supplier=188687";
                URL url = new URL(urls);
                final HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("Content-Type", "application/json");
                con.setConnectTimeout(5000);
                con.setReadTimeout(4000);

                final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;

                final StringBuilder stringBuilder = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    stringBuilder.append(inputLine);
                }
                Gson g = new Gson();
//            ObjectMapper mapper = new ObjectMapper();
                StringReader reader = new StringReader(stringBuilder.toString());
//            String s = stringBuilder.substring(stringBuilder.toString().lastIndexOf("["));
                ResponseProducts results = g.fromJson(reader, ResponseProducts.class);
                Data data = results.getData();
                result.addAll(Arrays.asList(data.getProducts()));
            }
            return result;

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<Product> searchQuery(String key, long page) {
        int i = 0;
        try {
            List<Product> result = new ArrayList<>();
            while (i < page) {

                String urls = "https://search.wb.ru/exactmatch/ru/male/v4/search?resultset=catalog&appType=1&curr=rub&dest=12358048&page=" + ++i + "&regions=80,64,38,4,115,83,33,68,70,69,30,86,40,1,66,48,110,31,22,114&spp=20&query=" + key;
                URL url = new URL(urls);
                final HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("Content-Type", "application/json");
                con.setConnectTimeout(5000);
                con.setReadTimeout(4000);

                final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;

                final StringBuilder stringBuilder = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    stringBuilder.append(inputLine);
                }
                Gson g = new Gson();
//            ObjectMapper mapper = new ObjectMapper();
                StringReader reader = new StringReader(stringBuilder.toString());
//            String s = stringBuilder.substring(stringBuilder.toString().lastIndexOf("["));
                ResponseProducts results = g.fromJson(reader, ResponseProducts.class);
                Data data = results.getData();
                result.addAll(Arrays.asList(data.getProducts()));
            }
            return result;

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<Product> getGoodzData(String url, String article) {
        url = url + article;
        try {
            URL url1 = new URL(url);
            final HttpURLConnection con = (HttpURLConnection) url1.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setConnectTimeout(5000);
            con.setReadTimeout(4000);


            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            final StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            ObjectMapper mapper = new ObjectMapper();

            StringReader reader = new StringReader(stringBuilder.toString());
            String s = stringBuilder.substring(stringBuilder.toString().lastIndexOf("["));

            Product[] result = mapper.readValue(s, Product[].class);

            return Arrays.asList(result);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<DataWH> getWarehouseData(URL url) {
        try {
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", TOKEN);
            con.setConnectTimeout(5000);
            con.setReadTimeout(4000);


            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            final StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            ObjectMapper mapper = new ObjectMapper();

            StringReader reader = new StringReader(stringBuilder.toString());
            String s = stringBuilder.substring(stringBuilder.toString().lastIndexOf("["));

            DataWH[] result = mapper.readValue(s, DataWH[].class);

            return Arrays.asList(result);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static JSONObject stream(URL url) {
        JSONParser parser = new JSONParser();
        try (InputStream inputStream = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);
            return (JSONObject) parser.parse(reader);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void parse(URL url) {
        JSONParser parser = new JSONParser();
        try (InputStream inputStream = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);
            JSONObject root = (JSONObject) parser.parse(reader);

            JSONArray productsarray = (JSONArray) root.get("products");

            System.out.println(root.get("data").toString());
            System.out.println(parser.toString());
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String printValues(Object... obj) {
        for (var k : obj) {
            if (obj instanceof Object) {
                return printValues(k).toString();
            } else {
                System.out.println(k + "<br>");
            }
        }
        return null;
    }
}
