package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsThree {
    public Currencies thirdTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 41:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ETB", "Ethiopian Birr");
                }
                else {
                    currencies = new CurrencyToBeConverted("ETB", "Ethiopian Birr");
                }

                break;

            case 42:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("EUR", "Euro");
                }
                else {
                    currencies = new CurrencyToBeConverted("EUR", "Euro");
                }

                break;

            case 43:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("FJD", "Fijian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("FJD", "Fijian Dollar");
                }

                break;

            case 44:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("FKP", "Falkland Islands Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("FKP", "Falkland Islands Pound");
                }

                break;

            case 45:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("FOK", "Faroese Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("FOK", "Faroese Crown");
                }

                break;

            case 46:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GBP", "Pound Sterling");
                }
                else {
                    currencies = new CurrencyToBeConverted("GBP", "Pound Sterling");
                }

                break;

            case 47:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GEL", "Georgian Lari");
                }
                else {
                    currencies = new CurrencyToBeConverted("GEL", "Georgian Lari");
                }

                break;

            case 48:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GGP", "Gurnsey Pounds");
                }
                else {
                    currencies = new CurrencyToBeConverted("GGP", "Gurnsey Pounds");
                }

                break;

            case 49:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GHS", "Cedi");
                }
                else {
                    currencies = new CurrencyToBeConverted("GHS", "Cedi");
                }

                break;

            case 50:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GIP", "Gibraltarian Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("GIP", "Gibraltarian Pound");
                }

                break;

            case 51:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GMD", "Dalasi");
                }
                else {
                    currencies = new CurrencyToBeConverted("GMD", "Dalasi");
                }

                break;

            case 52:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GNF", "Guinean Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("GNF", "Guinean Franc");
                }

                break;

            case 53:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GTQ", "Quetzal");
                }
                else {
                    currencies = new CurrencyToBeConverted("GTQ", "Quetzal");
                }

                break;

            case 54:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("GYD", "Guyanaese Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("GYD", "Guyanaese Dollar");
                }

                break;

            case 55:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("HKD", "Hong Kong dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("HKD", "Hong Kong dollar");
                }

                break;

            case 56:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("HNL", "Honduran Lempira");
                }
                else {
                    currencies = new CurrencyToBeConverted("HNL", "Honduran Lempira");
                }

                break;

            case 57:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("HRK", "Croatian Kuna");
                }
                else {
                    currencies = new CurrencyToBeConverted("HRK", "Croatian Kuna");
                }

                break;

            case 58:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("HTG", "Gourde");
                }
                else {
                    currencies = new CurrencyToBeConverted("HTG", "Gourde");
                }

                break;

            case 59:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("HUF", "Hungarian Forint");
                }
                else {
                    currencies = new CurrencyToBeConverted("HUF", "Hungarian Forint");
                }

                break;

            case 60:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("IDR", "Indonesian Rupiah");
                }
                else {
                    currencies = new CurrencyToBeConverted("IDR", "Indonesian Rupiah");
                }

                break;

            default:
                currencies = new OptionsFour().fourthTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
