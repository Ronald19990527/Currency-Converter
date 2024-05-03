package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsSeven {
    public Currencies seventhTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 121:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SCR", "Seychelles Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("SCR", "Seychelles Rupee");
                }

                break;

            case 122:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SDG", "Sudanese Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("SDG", "Sudanese Pound");
                }

                break;

            case 123:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SEK", "Swedish Crown");
                }
                else {
                    currencies = new CurrencyToBeConverted("SEK", "Swedish Crown");
                }

                break;

            case 124:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SGD", "Singapore Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("SGD", "Singapore Dollar");
                }

                break;

            case 125:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SHP", "Saint Helena Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("SHP", "Saint Helena Pound");
                }

                break;

            case 126:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SLE", "Leone");
                }
                else {
                    currencies = new CurrencyToBeConverted("SLE", "Leone");
                }

                break;

            case 127:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SLL", "Leone");
                }
                else {
                    currencies = new CurrencyToBeConverted("SLL", "Leone");
                }

                break;

            case 128:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SOS", "Somali Shilling");
                }
                else {
                    currencies = new CurrencyToBeConverted("SOS", "Somali Shilling");
                }

                break;

            case 129:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SRD", "Surinamese Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("SRD", "Surinamese Dollar");
                }

                break;

            case 130:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SSP", "South Sudanese Pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("SSP", "South Sudanese Pound");
                }

                break;

            case 131:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("STN", "Sao Tomean Dobra");
                }
                else {
                    currencies = new CurrencyToBeConverted("STN", "Sao Tomean Dobra");
                }

                break;

            case 132:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SYP", "Solomon Islands dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("SYP", "Solomon Islands dollar");
                }

                break;

            case 133:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("SZL", "Lilangeni");
                }
                else {
                    currencies = new CurrencyToBeConverted("SZL", "Lilangeni");
                }

                break;

            case 134:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("THB", "Thai Baht");
                }
                else {
                    currencies = new CurrencyToBeConverted("THB", "Thai Baht");
                }

                break;

            case 135:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TJS", "Tajik Somoni");
                }
                else {
                    currencies = new CurrencyToBeConverted("TJS", "Tajik Somoni");
                }

                break;

            case 136:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TMT", "Turkmen Manat");
                }
                else {
                    currencies = new CurrencyToBeConverted("TMT", "Turkmen Manat");
                }

                break;

            case 137:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TND", "Tunisian Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("TND", "Tunisian Dinar");
                }

                break;

            case 138:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TOP", "Kuwaiti Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("TOP", "Kuwaiti Dinar");
                }

                break;

            case 139:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TRY", "Turkish Lira");
                }
                else {
                    currencies = new CurrencyToBeConverted("TRY", "Turkish Lira");
                }

                break;

            case 140:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TTD", "Trinidad dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("TTD", "Trinidad dollar");
                }

                break;

            default:
                currencies = new OptionsEight().eighthTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
