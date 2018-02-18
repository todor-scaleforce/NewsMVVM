package com.example.newsmvvm.models;

/**
 * Created by tosheto on 2/18/2018.
 */

public enum Country {

    US("us"),
    POLAND("pl"),
    DENMARK("de"),
    BULGARIA("bg"),
    RUSSIA("ru");

    private final String abbreviation;

    private Country(String abbreviation) {
        this.abbreviation = abbreviation;
    }


    public String getAbbreviation() {
        return abbreviation;
    }
}
