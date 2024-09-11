package com.hill.jsonparser;

import org.json.JSONObject;

public class OrgJsonParserTest {
    public static void main(String args[]) {
        String jsonString = "{ \"name\": \"John\", \"age\": 30, \"address\": {\"street\": \"Some Street\"}}";

        JSONObject jo = new JSONObject(jsonString);

        System.out.println(jo);

        System.out.println(jo.get("age"));
        System.out.println(jo.getJSONObject("address").get("street"));
    }
}
