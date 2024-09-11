package com.hill.dbconnector;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public enum DBPool {
    INSTANCE;

    private final HikariConfig config = new HikariConfig();
    private final HikariDataSource dataSource;

    DBPool() {
        config.setJdbcUrl(Secret.get("jdbc.url"));
        config.setUsername(Secret.get("jdbc.user"));
        config.setPassword(Secret.get("jdbc.pass"));
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        dataSource = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}

//Apache DBCP, C3P0, BoneCP, Tomcat JDBC Connection Pool, Spring Boot Connection Pooling