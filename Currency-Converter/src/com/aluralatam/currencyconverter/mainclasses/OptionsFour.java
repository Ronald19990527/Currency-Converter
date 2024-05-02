package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsFour {
    public Currencies fourthTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 61:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ILS", "Nuevo séquel");
                }
                else {
                    currencies = new CurrencyToBeConverted("ILS", "Nuevo séquel");
                }

                break;

            case 62:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("IMP", "Isle of Man Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("IMP", "Isle of Man Pound");
                }

                break;

            case 63:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("INR", "Indian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("INR", "Indian Rupee");
                }

                break;

            case 64:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("IQD", "Raqi Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("IQD", "Raqi Dinar");
                }

                break;

            case 65:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("IRR", "Iranian Rial");
                }
                else {
                    currencies = new CurrencyToBeConverted("IRR", "Iranian Rial");
                }

                break;

            case 66:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ISK", "Icelandic Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("ISK", "Icelandic Crown");
                }

                break;

            case 67:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("JEP", "Jersey Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("JEP", "Jersey Pound");
                }

                break;

            case 68:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("JMD", "Jamaican Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("JMD", "Jamaican Dollar");
                }

                break;

            case 69:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("JOD", "Jordanian Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("JOD", "Jordanian Dinar");
                }

                break;

            case 70:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("JPY", "Japanese Yen");
                }
                else {
                    currencies = new CurrencyToBeConverted("JPY", "Japanese Yen");
                }

                break;

            case 71:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KES", "Kenyan Shilling");
                }
                else {
                    currencies = new CurrencyToBeConverted("KES", "Kenyan Shilling");
                }

                break;

            case 72:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KGS", "Kyrgyz Som");
                }
                else {
                    currencies = new CurrencyToBeConverted("KGS", "Kyrgyz Som");
                }

                break;

            case 73:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KHR", "Cambodian Riel");
                }
                else {
                    currencies = new CurrencyToBeConverted("KHR", "Cambodian Riel");
                }

                break;

            case 74:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KID", "Cayman Islands Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("KID", "Cayman Islands Dollar");
                }

                break;

            case 75:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KMF", "Comorian Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("KMF", "Comorian Franc");
                }

                break;

            case 76:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KRW", "South Korean Won");
                }
                else {
                    currencies = new CurrencyToBeConverted("KRW", "South Korean Won");
                }

                break;

            case 77:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KWD", "Dinar Kuwaití");
                }
                else {
                    currencies = new CurrencyToBeConverted("KWD", "Dinar Kuwaití");
                }

                break;

            case 78:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AFN", "Afghani Afghani");
                }
                else {
                    currencies = new CurrencyToBeConverted("AFN", "Afghani Afghani");
                }

                break;

            case 79:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("KZT", "Tenge Kazajo");
                }
                else {
                    currencies = new CurrencyToBeConverted("KZT", "Tenge Kazajo");
                }

                break;

            case 80:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("LAK", "Lao Kip");
                }
                else {
                    currencies = new CurrencyToBeConverted("LAK", "Lao Kip");
                }

                break;

            default:
                currencies = new OptionsFive().fifthTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
