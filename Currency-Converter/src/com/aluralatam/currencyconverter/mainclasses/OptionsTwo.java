package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsTwo {
    public Currencies secondTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 21:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BSD", "Bahamian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BSD", "Bahamian Dollar");
                }

                break;

            case 22:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BTN", "Indian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("BTN", "Indian Rupee");
                }

                break;

            case 23:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BWP", "Pula");
                }
                else {
                    currencies = new CurrencyToBeConverted("BWP", "Pula");
                }

                break;

            case 24:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BYN", "New Belarusian Ruble");
                }
                else {
                    currencies = new CurrencyToBeConverted("BYN", "New Belarusian Ruble");
                }

                break;

            case 25:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BZD", "Belizean Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BZD", "Belizean Dollar");
                }

                break;

            case 26:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CAD", "Canadian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("CAD", "Canadian Dollar");
                }

                break;

            case 27:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CDF", "Congolese Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("CDF", "Congolese Franc");
                }

                break;

            case 28:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CHF", "Swiss Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("CHF", "Swiss Franc");
                }

                break;

            case 29:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CLP", "Chilean Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("CLP", "Chilean Peso");
                }

                break;

            case 30:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CNY", "Renminbi");
                }
                else {
                    currencies = new CurrencyToBeConverted("CNY", "Renminbi");
                }

                break;

            case 31:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CRC", "Costa Rican Colon");
                }
                else {
                    currencies = new CurrencyToBeConverted("CRC", "Costa Rican Colon");
                }

                break;

            case 32:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CUP", "Cuban Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("CUP", "Cuban Peso");
                }

                break;

            case 33:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CVE", "Cape Verdean Coat of Arms");
                }
                else {
                    currencies = new CurrencyToBeConverted("CVE", "Cape Verdean Coat of Arms");
                }

                break;

            case 34:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("CZK", "Czech Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("CZK", "Czech Crown");
                }

                break;

            case 35:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("DJF", "Djibouti Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("DJF", "Djibouti Franc");
                }

                break;

            case 36:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("DKK", "Danish Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("DKK", "Danish Crown");
                }

                break;

            case 37:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("DOP", "Dominican Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("DOP", "Dominican Peso");
                }

                break;

            case 38:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("DZD", "Algerian dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("DZD", "Algerian dinar");
                }

                break;

            case 39:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("EGP", "Egyptian Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("EGP", "Egyptian Pound");
                }

                break;

            case 40:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ERN", "Nakfa");
                }
                else {
                    currencies = new CurrencyToBeConverted("ERN", "Nakfa");
                }

                break;

            default:
                currencies = new OptionsThree().thirdTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
