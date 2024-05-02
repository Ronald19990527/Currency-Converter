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
                    currencies = new CurrencyToConvert("LBP", "Lebanese pound");
                }
                else {
                    currencies = new CurrencyToBeConverted("LBP", "Lebanese pound");
                }

                break;

            case 82:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("LKR", "Sri Lanka rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("LKR", "Sri Lanka rupee");
                }

                break;

            case 83:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("LRD", "Liberian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("LRD", "Liberian Dollar");
                }

                break;

            case 84:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("LSL", "Loti");
                }
                else {
                    currencies = new CurrencyToBeConverted("LSL", "Loti");
                }

                break;

            case 85:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("LYD", "Libyan dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("LYD", "Libyan dinar");
                }

                break;

            case 86:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MAD", "Moroccan dirham");
                }
                else {
                    currencies = new CurrencyToBeConverted("MAD", "Moroccan dirham");
                }

                break;

            case 87:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MDL", "Moldovan Leu");
                }
                else {
                    currencies = new CurrencyToBeConverted("MDL", "Moldovan Leu");
                }

                break;

            case 88:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MGA", "Malagasy Ariary");
                }
                else {
                    currencies = new CurrencyToBeConverted("MGA", "Malagasy Ariary");
                }

                break;

            case 89:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MKD", "Macedonian Denar");
                }
                else {
                    currencies = new CurrencyToBeConverted("MKD", "Macedonian Denar");
                }

                break;

            case 90:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MMK", "Burmese Kyat");
                }
                else {
                    currencies = new CurrencyToBeConverted("MMK", "Burmese Kyat");
                }

                break;

            case 91:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MNT", "Mongolian Tugrik");
                }
                else {
                    currencies = new CurrencyToBeConverted("MNT", "Mongolian Tugrik");
                }

                break;

            case 92:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MOP", "Macanese Pataca");
                }
                else {
                    currencies = new CurrencyToBeConverted("MOP", "Macanese Pataca");
                }

                break;

            case 93:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MRU", "Ouguiya");
                }
                else {
                    currencies = new CurrencyToBeConverted("MRU", "Ouguiya");
                }

                break;

            case 94:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MUR", "Mauritian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("MUR", "Mauritian Rupee");
                }

                break;

            case 95:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MVR", "Maldivian Rupee");
                }
                else {
                    currencies = new CurrencyToBeConverted("MVR", "Maldivian Rupee");
                }

                break;

            case 96:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MWK", "Malawi Kwacha");
                }
                else {
                    currencies = new CurrencyToBeConverted("MWK", "Malawi Kwacha");
                }

                break;

            case 97:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MXN", "Mexican Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("MXN", "Mexican Peso");
                }

                break;

            case 98:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MYR", "Malaysian Ringgit");
                }
                else {
                    currencies = new CurrencyToBeConverted("MYR", "Malaysian Ringgit");
                }

                break;

            case 99:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("MZN", "Mozambican metical");
                }
                else {
                    currencies = new CurrencyToBeConverted("MZN", "Mozambican metical");
                }

                break;

            case 100:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("NAD", "Namibian dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("NAD", "Namibian dollar");
                }

                break;

            default:
                currencies = new OptionsSix().sixthTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
