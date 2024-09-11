package com.hill.jsonparser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hill.jsonparser.parsingobjects.BrowsersRoot;
import com.hill.jsonparser.parsingobjects.PersonRoot;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FasterxmlParserTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();

        PersonRoot[] personRoot = om.readValue(
                new FileReader(Paths.get("src/main/resources/example.json").toAbsolutePath().toString()),
                PersonRoot[].class);
        List<PersonRoot> personRootList = Arrays.stream(personRoot).peek(System.out::println).collect(Collectors.toList());


        BrowsersRoot browsersRoot = om.readValue(
                new FileReader(Paths.get("src/main/resources/browsers.json").toAbsolutePath().toString()),
                BrowsersRoot.class);
        System.out.println(browsersRoot.firefox.versions._125_0.image);
    }
}
