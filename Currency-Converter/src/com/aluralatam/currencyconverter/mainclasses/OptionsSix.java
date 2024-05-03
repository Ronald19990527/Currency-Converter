package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsSix {
    public Currencies sixthTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 101:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NGN", "Naira");
                }
                else {
                    currencies = new CurrencyToBeConverted("NGN", "Naira");
                }

                break;

            case 102:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NIO", "Cordova");
                }
                else {
                    currencies = new CurrencyToBeConverted("NIO", "Cordova");
                }

                break;

            case 103:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NOK", "The Norwegian Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("NOK", "The Norwegian Crown");
                }

                break;

            case 104:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NPR", "Nepalese Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("NPR", "Nepalese Rupee");
                }

                break;

            case 105:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NZD", "New Zealand Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("NZD", "New Zealand Dollar");
                }

                break;

            case 106:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("OMR", "Rial");
                }
                else {
                    currencies = new CurrencyToBeConverted("OMR", "Rial");
                }

                break;

            case 107:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PAB", "Balboa");
                }
                else {
                    currencies = new CurrencyToBeConverted("PAB", "Balboa");
                }

                break;

            case 108:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PEN", "Peruvian Sun");
                }
                else {
                    currencies = new CurrencyToBeConverted("PEN", "Peruvian Sun");
                }

                break;

            case 109:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PGK", "Kina");
                }
                else {
                    currencies = new CurrencyToBeConverted("PGK", "Kina");
                }

                break;

            case 110:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PHP", "Philippine Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("PHP", "Philippine Peso");
                }

                break;

            case 111:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PKR", "Rupia Pakistaní");
                }
                else {
                    currencies = new CurrencyToBeConverted("PKR", "Rupia Pakistaní");
                }

                break;

            case 112:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PLN", "Złoty");
                }
                else {
                    currencies = new CurrencyToBeConverted("PLN", "Złoty");
                }

                break;

            case 113:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("PYG", "Paraguayan Guarani");
                }
                else {
                    currencies = new CurrencyToBeConverted("PYG", "Paraguayan Guarani");
                }

                break;

            case 114:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("QAR", "Qatari Riyal");
                }
                else {
                    currencies = new CurrencyToBeConverted("QAR", "Qatari Riyal");
                }

                break;

            case 115:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("RON", "Romanian Leu");
                }
                else {
                    currencies = new CurrencyToBeConverted("RON", "Romanian Leu");
                }

                break;

            case 116:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("RSD", "Serbian Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("RSD", "Serbian Dinar");
                }

                break;

            case 117:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("RUB", "Russian Ruble");
                }
                else {
                    currencies = new CurrencyToBeConverted("RUB", "Russian Ruble");
                }

                break;

            case 118:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("RWF", "Malaysian Ringgit");
                }
                else {
                    currencies = new CurrencyToBeConverted("RWF", "Malaysian Ringgit");
                }

                break;

            case 119:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SAR", "Saudi Riyal");
                }
                else {
                    currencies = new CurrencyToBeConverted("SAR", "Saudi Riyal");
                }

                break;

            case 120:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SBD", "Solomon Islands Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("SBD", "Solomon Islands Dollar");
                }

                break;

            default:
                currencies = new OptionsSeven().seventhTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
