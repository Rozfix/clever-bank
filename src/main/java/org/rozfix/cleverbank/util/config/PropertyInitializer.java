package org.rozfix.cleverbank.util.config;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class PropertyInitializer {
    public static void initProperty() throws IOException {
        SystemProperty[] properties = SystemProperty.values();
        Yaml yaml = new Yaml();
        Map<String, Map<String, String>> yamlProperty;
        try (InputStream in = Files.newInputStream(Paths.get("src/main/resources/application.yml"))) {
            yamlProperty = yaml.load(in);
        }
        for (SystemProperty property : properties) {
            System.setProperty(property.getSystemName(), yamlProperty.get("dbProperties").get(property.toString().toLowerCase()));
        }

    }
}
