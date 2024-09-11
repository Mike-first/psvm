package com.hill.dbconnector;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Secret {


    protected static Properties properties = null;
    private static final Path PROPERTY_FILE = Paths.get("D:/work/secrets/secret.properties").toAbsolutePath();

    public static String get(String key) {
        return getProperty(key);
    }

    private static String getProperty(String key) {
        if (properties == null) properties = readPropertyFileOnce();
        return properties.getProperty(key);
    }

    private static java.util.Properties readPropertyFileOnce() {
        java.util.Properties properties = new java.util.Properties();
        try (InputStreamReader is = new InputStreamReader(
                Files.newInputStream(PROPERTY_FILE), StandardCharsets.UTF_8
        )) {
            properties.load(is);
        } catch (IOException ignored) {
        }
        return properties;
    }

}
