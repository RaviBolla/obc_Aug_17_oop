package com.oop;

/**
 * Created by ravibol on 8/7/17.
 */
public class FailScenario {

    public int maxConnectionsFailSlow() {
        String property = getProperty("maxConnections");
        if (property == null) {
            return 10;
        }
        else {
            return Integer.parseInt(property);
        }
    }

    private String getProperty(String maxConnections) {
        return "prop from file";
    }

    public int maxConnectionsFailFast() {
        String property = getProperty("maxConnections");
        if (property == null) {
            throw new NullPointerException("maxConnections property not found in configuration");
        }
        else {
            return Integer.parseInt(property);
        }
    }
}
