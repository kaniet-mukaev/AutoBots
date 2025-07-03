package com.autobots.java.lambda.bankApplication;

public enum Banks {
    MBANK("MBank"),
    OPTIMABANK("OptimaBank"),
    DEMIRBANK("DemirBank"),
    OBANK("O!Bank");

    private String description;

    Banks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
