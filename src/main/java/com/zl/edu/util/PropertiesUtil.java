package com.zl.edu.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by user on 2018/3/1.
 */
public class PropertiesUtil {

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(new InputStreamReader(PropertiesUtil.class.getResourceAsStream("edu.properties"), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        String value = getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    public static Integer getIntegerProperty(String key, Integer defaultValue) {
        String value = getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        return Integer.parseInt(value);
    }

    public static Long getLongProperty(String key, Long defaultValue) {
        String value = getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        return Long.parseLong(value);
    }

    public static Double getDoubleProperty(String key, Double defaultValue) {
        String value = getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        return Double.parseDouble(value);
    }
}
