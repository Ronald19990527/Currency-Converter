package com.aluralatam.currencyconverter.currenciesrequest;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;

import java.io.IOException;

public interface HttpRequestTwoCurrenciesDAO {
    public void toDoRequest(double quantity) throws IOException, InterruptedException;
}
