package com.aluralatam.currencyconverter.currenciesrequest;

import com.aluralatam.currencyconverter.exceptions.ExceptionSyntaxJson;
import com.aluralatam.currencyconverter.exceptions.ExceptionsInterrupted;
import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;
import com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory.ManageHistoryDAO;
import com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory.ManageHistoryImpl;
import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestTwoCurrenciesImpl implements HttpRequestTwoCurrenciesDAO {
    private static Currencies currencyToConvert;
    private static Currencies currencyToBeConverted;
    private final ManageHistoryDAO manageHistoryDAO = new ManageHistoryImpl();

    public HttpRequestTwoCurrenciesImpl(Currencies currencyToConvert, Currencies currencyToBeConverted) {
        HttpRequestTwoCurrenciesImpl.currencyToConvert = currencyToConvert;
        HttpRequestTwoCurrenciesImpl.currencyToBeConverted = currencyToBeConverted;
    }

    public void toDoRequest(double quantity) throws ExceptionsManagementHistory {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/75cf930bc271ea3861c36558/pair/" +
                            HttpRequestTwoCurrenciesImpl.currencyToConvert.getCurrencyCode() +
                            "/" + HttpRequestTwoCurrenciesImpl.currencyToBeConverted.getCurrencyCode()))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new Gson();

            HttpResponseDAO httpResponseDAO = gson.fromJson(json, HttpResponseImpl.class);

            System.out.println("\nConversion Result : " + quantity + " " +
                    HttpRequestTwoCurrenciesImpl.currencyToConvert.getCurrencyName() +
                    " (" + httpResponseDAO.getBaseCode() + ") are equivalent to " +
                    quantity * httpResponseDAO.getConversionRate() + " " +
                    HttpRequestTwoCurrenciesImpl.currencyToBeConverted.getCurrencyName() +
                    " (" + httpResponseDAO.getTargetCode() + ")");

            manageHistoryDAO.verifyIfNewHistoryFileExistsAndWrite("Conversion Result : " + quantity + " (" +
                    httpResponseDAO.getBaseCode() + ") are equivalent to " + quantity * httpResponseDAO.getConversionRate() +
                    " (" + httpResponseDAO.getTargetCode() + ") => " + httpResponseDAO.getTimeLastUpdateUtc());
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error managing history" + exception.getMessage());
        } catch (InterruptedException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsInterrupted("Error communicating with API" + exception.getMessage());
        } catch (JsonSyntaxException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionSyntaxJson("Error in the JSON Syntax" + exception.getMessage());
        }
    }
}
