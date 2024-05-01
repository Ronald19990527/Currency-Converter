package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsFive {
    public Currencies fifthTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 81:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Lebanese pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Lebanese pound");
                }

                break;

            case 82:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Sri Lanka rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Sri Lanka rupee");
                }

                break;

            case 83:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Liberian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Liberian Dollar");
                }

                break;

            case 84:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Loti");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Loti");
                }

                break;

            case 85:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Libyan dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Libyan dinar");
                }

                break;

            case 86:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Moroccan dirham");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Moroccan dirham");
                }

                break;

            case 87:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Moldovan Leu");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Moldovan Leu");
                }

                break;

            case 88:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Malagasy Ariary");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Malagasy Ariary");
                }

                break;

            case 89:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Macedonian Denar");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Macedonian Denar");
                }

                break;

            case 90:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Burmese Kyat");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Burmese Kyat");
                }

                break;

            case 91:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Mongolian Tugrik");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Mongolian Tugrik");
                }

                break;

            case 92:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Macanese Pataca");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Macanese Pataca");
                }

                break;

            case 93:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Ouguiya");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Ouguiya");
                }

                break;

            case 94:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Mauritian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Mauritian Rupee");
                }

                break;

            case 95:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Maldivian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Maldivian Rupee");
                }

                break;

            case 96:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Malawi Kwacha");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Malawi Kwacha");
                }

                break;

            case 97:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Mexican Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Mexican Peso");
                }

                break;

            case 98:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Malaysian Ringgit");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Malaysian Ringgit");
                }

                break;

            case 99:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Mozambican metical");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Mozambican metical");
                }

                break;

            case 100:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Namibian dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Namibian dollar");
                }

                break;

            default:
                currencies = null;

                break;
        }

        return currencies;
    }
}
