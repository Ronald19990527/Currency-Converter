package com.aluralatam.currencyconverter.currenciesrequest;

import com.google.gson.annotations.SerializedName;

public class HttpResponseImpl implements HttpResponseDAO {
    @SerializedName("time_last_update_utc")
    private String timeLastUpdateUtc;
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_rate")
    private double conversionRate;

    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
