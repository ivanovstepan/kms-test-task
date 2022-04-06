package com.kms.web;

import com.github.hardnorth.common.config.ConfigLoader;
import com.github.hardnorth.common.config.ConfigProvider;

public class Properties {

    private Properties() {
    }

    private static final ConfigProvider PROVIDER = new ConfigLoader().get();

    public static String getPropertyString(String name) {
        return PROVIDER.getProperty(name, String.class);
    }

    public static int getPropertyInt(String name) {
        return PROVIDER.getProperty(name, Integer.class);
    }

    public static Long getPropertyLong(String name) {
        return PROVIDER.getProperty(name, Long.class);
    }
}
