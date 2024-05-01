package com.aluralatam.currencyconverter.currenciesrequest;

public interface HttpResponseDAO {
    public String getTimeLastUpdateUtc();

    public String getBaseCode();

    public String getTargetCode();

    public double getConversionRate();
}
