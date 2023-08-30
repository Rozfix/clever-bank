package org.rozfix.cleverbank.util.config;

public enum SystemProperty {
    URL("jdbc:postgresql://localhost:5432/northwind"),
    USERNAME("postgres"),
    PASSWORD("1111");

    private String systemName;

    SystemProperty(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemName() {
        return systemName;
    }
}
