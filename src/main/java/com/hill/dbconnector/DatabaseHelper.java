package com.hill.dbconnector;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class DatabaseHelper {

    private static <T> List<T> fetchV1(String query, Class<T> clazz) throws SQLException {
        List<T> results = new ArrayList<>();

        try (Connection connection = DBPool.INSTANCE.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            Field[] fields = clazz.getDeclaredFields();

            while (resultSet.next()) {
                try {
                    T instance = clazz.newInstance();

                    for (Field field : fields) {
                        field.setAccessible(true);
                        String columnName = field.getName().toLowerCase();
                        Object value = resultSet.getObject(columnName);
                        if (value != null) {
                            field.set(instance, value);
                        }
                    }

                    results.add(instance);
                } catch (InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return results;
    }

    private static <T> List<T> fetchV2(String query, Class<T> clazz) throws SQLException {
        List<T> results = new ArrayList<>();

        try (Connection connection = DBPool.INSTANCE.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            Field[] fields = clazz.getDeclaredFields();

            while (resultSet.next()) {
                try {
                    T instance = clazz.newInstance();

                    for (Field field : fields) {
                        String setterMethodName = "set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                        Method setter = clazz.getMethod(setterMethodName, field.getType());
                        String columnName = field.getName().toLowerCase();
                        Object value = resultSet.getObject(columnName);
                        if (value != null && !value.equals("")) {
                            setter.invoke(instance, value);
                        }
                    }

                    results.add(instance);
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return results;
    }

    public static <T> List<T> fetch(String query, Class<T> clazz) {
        List<T> ts = Collections.emptyList();
        try {
            ts = DatabaseHelper.fetchV1(query, clazz);
        } catch (SQLException ignored) {
            log.error("SQLException while try request to DB");
        }
        return ts;
    }
}
