package com.hill.jsonparser;

import javax.json.*;
import java.io.IOException;
import java.io.StringReader;

public class JavaxJsonParseTest {
    public static void main(String[] args) throws IOException {
        String jsonString = "{ \"name\": \"John\", \"age\": 30, \"address\": {\"street\": \"Some Street\"}}";

        JsonReader reader = Json.createReader(new StringReader(jsonString));
        JsonObject jsonObject = reader.readObject();

        System.out.println("Name: " + jsonObject.getString("name"));

        System.out.println("age: " + jsonObject.getInt("age"));

        JsonObject address = jsonObject.getJsonObject("address");
        System.out.println("street: " + address.getString("street"));

        reader.close();
    }
}
