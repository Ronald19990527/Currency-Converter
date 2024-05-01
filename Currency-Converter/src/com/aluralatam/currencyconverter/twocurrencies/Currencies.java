package com.aluralatam.currencyconverter.twocurrencies;

public class Currencies {
    private String currencyCode;
    private String currencyName;

    public Currencies(String currencyCode, String currencyName) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
