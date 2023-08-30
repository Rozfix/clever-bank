package org.rozfix.cleverbank.repository;

import org.rozfix.cleverbank.util.config.SystemProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static volatile Connection instance;

    private DbConnection() {
    }

    public static Connection open() {
        if (instance != null) return instance;

        synchronized (Connection.class) {
            if (instance == null) {
                try {
                    try (Connection connection = DriverManager.getConnection(System.getProperty(SystemProperty.URL.getSystemName()), System.getProperty(SystemProperty.USERNAME.getSystemName()), System.getProperty(SystemProperty.PASSWORD.getSystemName()))) {
                        instance = connection;
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            return instance;
        }
    }

    public static void close() {
        try {
            instance.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
