package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsEight {
    public Currencies eighthTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 141:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TVD", "Tuvaluan Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("TVD", "Tuvaluan Dollar");
                }

                break;

            case 142:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TWD", "New Taiwan Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("TWD", "New Taiwan dollar");
                }

                break;

            case 143:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("TZS", "Tanzanian Shilling");
                }
                else {
                    currencies = new CurrencyToBeConverted("TZS", "Tanzanian Shilling");
                }

                break;

            case 144:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("UAH", "Hryvnia");
                }
                else {
                    currencies = new CurrencyToBeConverted("UAH", "Hryvnia");
                }

                break;

            case 145:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("UGX", "Ugandan Shilling");
                }
                else {
                    currencies = new CurrencyToBeConverted("UGX", "Ugandan Shilling");
                }

                break;

            case 146:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("USD", "Dólar Estadounidense");
                }
                else {
                    currencies = new CurrencyToBeConverted("USD", "Dólar Estadounidense");
                }

                break;

            case 147:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("UYU", "Uruguayan Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("UYU", "Uruguayan Peso");
                }

                break;

            case 148:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("UZS", "Uzbek Som");
                }
                else {
                    currencies = new CurrencyToBeConverted("UZS", "Uzbek Som");
                }

                break;

            case 149:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("VES", "Bolivar");
                }
                else {
                    currencies = new CurrencyToBeConverted("VES", "Bolivar");
                }

                break;

            case 150:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("VND", "Vietnamese Đồng");
                }
                else {
                    currencies = new CurrencyToBeConverted("VND", "Vietnamese Đồng");
                }

                break;

            case 151:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("VUV", "Vatu");
                }
                else {
                    currencies = new CurrencyToBeConverted("VUV", "Vatu");
                }

                break;

            case 152:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("WST", "Tālā");
                }
                else {
                    currencies = new CurrencyToBeConverted("WST", "Tālā");
                }

                break;

            case 153:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("XAF", "Central African CFA Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("XAF", "Central African CFA Franc");
                }

                break;

            case 154:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("XCD", "East Caribbean Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("XCD", "East Caribbean Dollar");
                }

                break;

            case 155:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("XDR", "XDR");
                }
                else {
                    currencies = new CurrencyToBeConverted("XDR", "XDR");
                }

                break;

            case 156:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("XOF", "West African CFA Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("XOF", "West African CFA Franc");
                }

                break;

            case 157:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("XPF", "CFP Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("XPF", "CFP Franc");
                }

                break;

            case 158:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("YER", "Rial Yemení");
                }
                else {
                    currencies = new CurrencyToBeConverted("YER", "Rial Yemení");
                }

                break;

            case 159:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ZAR", "South African Rand");
                }
                else {
                    currencies = new CurrencyToBeConverted("ZAR", "South African Rand");
                }

                break;

            case 160:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ZMW", "Zambian Kwacha");
                }
                else {
                    currencies = new CurrencyToBeConverted("ZMW", "Zambian Kwacha");
                }

                break;

            case 161:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ZWL", "Zimbabwe Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("ZWL", "Zimbabwe Dollar");
                }

                break;

            default:
                currencies = null;

                break;
        }

        return currencies;
    }
}
