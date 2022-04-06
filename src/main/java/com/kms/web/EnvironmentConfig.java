package com.kms.web;

public class EnvironmentConfig {

    public static final String url;

    static {
        url = Properties.getPropertyString("env.url");
    }
}
