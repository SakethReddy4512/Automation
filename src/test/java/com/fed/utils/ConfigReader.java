package com.fed.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static void loadProperties(){
        try{
            FileInputStream fis = new FileInputStream("src/test/resources/properties/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String get(String key) {
        if (properties == null) loadProperties();
        return properties.getProperty(key);
    }
}
