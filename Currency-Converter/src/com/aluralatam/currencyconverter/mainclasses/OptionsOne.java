package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.twocurrencies.Currencies;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToBeConverted;
import com.aluralatam.currencyconverter.twocurrencies.CurrencyToConvert;

public class OptionsOne {
    public Currencies firstTwentyOptions (int option, boolean currencyToConvert) {
        Currencies currencies = null;

        switch (option) {
            case 1:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("COP", "Colombian Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("COP", "Colombian Peso");
                }

                break;

            case 2:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AED", "United Arab Emirates Dirham");
                }
                else {
                    currencies = new CurrencyToBeConverted("AED", "United Arab Emirates Dirham");
                }

                break;

            case 3:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ALL", "Albanian Lek");
                }
                else {
                    currencies = new CurrencyToBeConverted("ALL", "Albanian Lek");
                }

                break;

            case 4:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AMD", "Armenian Dram");
                }
                else {
                    currencies = new CurrencyToBeConverted("AMD", "Armenian Dram");
                }

                break;

            case 5:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ANG", "Netherlands Antillean Guilder");
                }
                else {
                    currencies = new CurrencyToBeConverted("ANG", "Netherlands Antillean Guilder");
                }

                break;

            case 6:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AOA", "Angolan Kwanza");
                }
                else {
                    currencies = new CurrencyToBeConverted("AOA", "Angolan Kwanza");
                }

                break;

            case 7:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("ARS", "Argentine Peso");
                }
                else {
                    currencies = new CurrencyToBeConverted("ARS", "Argentine Peso");
                }

                break;

            case 8:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AUD", "Australian Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("AUD", "Australian Dollar");
                }

                break;

            case 9:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AWG", "Aruban Florin");
                }
                else {
                    currencies = new CurrencyToBeConverted("AWG", "Aruban Florin");
                }

                break;

            case 10:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("AZN", "Azerbaijani Manat");
                }
                else {
                    currencies = new CurrencyToBeConverted("AZN", "Azerbaijani Manat");
                }

                break;

            case 11:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BAM", "Bosnia and Herzegovina Mark");
                }
                else {
                    currencies = new CurrencyToBeConverted("BAM", "Bosnia and Herzegovina Mark");
                }

                break;

            case 12:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BBD", "Barbadian dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BBD", "Barbadian dollar");
                }

                break;

            case 13:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BDT", "Bangladeshi Taka");
                }
                else {
                    currencies = new CurrencyToBeConverted("BDT", "Bangladeshi Taka");
                }

                break;

            case 14:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BGN", "Lev");
                }
                else {
                    currencies = new CurrencyToBeConverted("BGN", "Lev");
                }

                break;

            case 15:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BHD", "Bahraini Dinar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BHD", "Bahraini Dinar");
                }

                break;

            case 16:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BIF", "Burundian Franc");
                }
                else {
                    currencies = new CurrencyToBeConverted("BIF", "Burundian Franc");
                }

                break;

            case 17:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BMD", "Bermuda Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BMD", "Bermuda Dollar");
                }

                break;

            case 18:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BND", "Brunei Dollar");
                }
                else {
                    currencies = new CurrencyToBeConverted("BND", "Brunei Dollar");
                }

                break;

            case 19:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BOB", "Bolivian");
                }
                else {
                    currencies = new CurrencyToBeConverted("BOB", "Bolivian");
                }

                break;

            case 20:
                if (currencyToConvert) {
                    currencies = new CurrencyToConvert("BRL", "Brazilian Real");
                }
                else {
                    currencies = new CurrencyToBeConverted("BRL", "Brazilian Real");
                }

                break;

            default:
                currencies = new OptionsTwo().secondTwentyOptions(option, currencyToConvert);

                break;
        }

        return currencies;
    }
}
