package com.hill.jsonparser.parsingobjects;
//https://json2csharp.com/code-converters/json-to-pojo

import java.util.ArrayList;

public class PersonRoot {
    public String name;
    public String city;
    public ArrayList<String> cars;
    public String job;

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                ", job='" + job + '\'' +
                '}';
    }
}
