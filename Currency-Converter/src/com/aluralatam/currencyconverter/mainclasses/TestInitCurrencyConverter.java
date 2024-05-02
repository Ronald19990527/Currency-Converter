package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.currenciesrequest.HttpRequestTwoCurrenciesDAO;
import com.aluralatam.currencyconverter.currenciesrequest.HttpRequestTwoCurrenciesImpl;
import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;
import com.aluralatam.currencyconverter.exceptions.OptionExceptions;
import com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory.ManageHistoryDAO;
import com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory.ManageHistoryImpl;
import com.aluralatam.currencyconverter.twocurrencies.Currencies;

import java.io.IOException;
import java.util.Scanner;

public class TestInitCurrencyConverter {
    private static boolean verifyDouble(String stringDouble) {
        Scanner teclado = new Scanner((System.in));

        String doYouWishToContinue = "Yes";

        if (OptionExceptions.validateDouble(stringDouble)) {
            return true;
        }
        else {
            System.out.println("Invalid format\nDo you wish to try it again (Enter Yes or No)? : ");
            doYouWishToContinue = teclado.next();

            if (!doYouWishToContinue.equalsIgnoreCase("Yes")) {
                return true;
            }
        }

        return false;
    }

    private static boolean verifyInteger(String stringInteger) {
        Scanner teclado = new Scanner(System.in);

        String doYouWishToContinue = "Yes";

        if (OptionExceptions.validateInt(stringInteger)) {
            return true;
        }
        else {
            System.out.print("Invalid format\nDo you wish to try it again (Enter Yes or No)? : ");
            doYouWishToContinue = teclado.next();

            if (!doYouWishToContinue.equalsIgnoreCase("Yes")) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws ExceptionsManagementHistory {
        try {
            Scanner teclado = new Scanner(System.in);

            String stringOption = null;
            int option = 0;

            ManageHistoryDAO manageHistoryDAO = new ManageHistoryImpl();

            do {
                System.out.print("""
                    \tCurrency Convert
                    1 . Convert currency
                    2 . View history
                    3 . Search elements of the history
                    4 . Delete element of the history
                    5 . Reset history
                    6 . Exit
                    Enter an option :\s""");
                stringOption = teclado.next();

                if (OptionExceptions.validateInt(stringOption)) {
                    option = Integer.parseInt(stringOption);

                    switch (option) {
                        case 1:
                            String stringOptionCurrency = null, stringQuantity = null;
                            int optionCurrencyToConvert = 0, optionCurrencyToBeConverted = 0;
                            double quantity = 0;
                            Currencies currencyToConvert;
                            Currencies currencyToBeConverted;

                            do {
                                System.out.println("\n\tCurrencies Menu");

                                new ShowMenu();

                                do {
                                    if (optionCurrencyToConvert == 0) {
                                        System.out.println("\tWhat currency do you want to convert (Enter -1 to exit)?");
                                    } else if (optionCurrencyToBeConverted == 0) {
                                        System.out.println("\tWhat currency do you want to convert it to (Enter -1 to exit)?");
                                    }

                                    System.out.print("Enter an option : ");
                                    stringOptionCurrency = teclado.next();
                                } while (!verifyInteger(stringOptionCurrency));

                                if (OptionExceptions.validateInt(stringOptionCurrency)) {
                                    if (optionCurrencyToConvert == 0) {
                                        optionCurrencyToConvert = Integer.parseInt(stringOptionCurrency);
                                    } else if (optionCurrencyToBeConverted == 0) {
                                        optionCurrencyToBeConverted = Integer.parseInt(stringOptionCurrency);
                                    }

                                    if (optionCurrencyToConvert != 0 && optionCurrencyToBeConverted != 0) {
                                        if (optionCurrencyToConvert != -1 && optionCurrencyToBeConverted != -1) {
                                            currencyToConvert = new OptionsOne().firstTwentyOptions(optionCurrencyToConvert,
                                                    true);

                                            currencyToBeConverted = new OptionsOne().firstTwentyOptions(optionCurrencyToBeConverted,
                                                    false);

                                            if (currencyToConvert != null && currencyToBeConverted != null) {
                                                HttpRequestTwoCurrenciesDAO httpRequestTwoCurrencies;
                                                httpRequestTwoCurrencies = new HttpRequestTwoCurrenciesImpl(currencyToConvert,
                                                        currencyToBeConverted);

                                                do {
                                                    System.out.print("\nEnter the quantity of " + currencyToConvert.getCurrencyName() +
                                                            " that you want to convert : $");
                                                    stringQuantity = teclado.next();
                                                } while (!verifyDouble(stringQuantity));

                                                if (OptionExceptions.validateDouble(stringQuantity)) {
                                                    quantity = Double.parseDouble(stringQuantity);

                                                    httpRequestTwoCurrencies.toDoRequest(quantity);

                                                    System.out.print("\nDo you wish to convert another currency (Enter Yes or No)? : ");
                                                    String doYouWishToConvertAnotherCurrency = teclado.next();

                                                    if (doYouWishToConvertAnotherCurrency.equalsIgnoreCase("Yes")) {
                                                        optionCurrencyToConvert = 0;

                                                        optionCurrencyToBeConverted = 0;
                                                    }
                                                    else {
                                                        optionCurrencyToConvert = -1;

                                                        optionCurrencyToBeConverted = -1;
                                                    }
                                                }
                                                else {
                                                    optionCurrencyToConvert = -1;

                                                    optionCurrencyToBeConverted = -1;
                                                }
                                            }
                                            else {
                                                System.out.println("\nTyped options are not available for both currencies, try it again");

                                                optionCurrencyToConvert = 0;

                                                optionCurrencyToBeConverted = 0;
                                            }
                                        }
                                    }
                                }
                                else {
                                    optionCurrencyToConvert = -1;

                                    optionCurrencyToBeConverted = -1;
                                }
                            } while (optionCurrencyToConvert != -1 && optionCurrencyToBeConverted != -1);

                            break;

                        case 2:
                            manageHistoryDAO.viewHistory();

                            break;

                        case 3:
                            System.out.print("\nEnter the element : ");
                            String elementToSearch = teclado.next();

                            manageHistoryDAO.searchElementOfTheHistory(elementToSearch);

                            break;

                        case 4:
                            System.out.print("\nEnter some item that match with the search for that you want to delete " +
                                    "(You can check out the history to be sure): ");
                            String itemToSearch = teclado.next();

                            manageHistoryDAO.deleteItemOfTheHistory(itemToSearch);

                            break;

                        case 5:
                            manageHistoryDAO.resetHistory();

                            break;

                        case 6:
                            System.out.println("\nThanks for participating");

                            break;

                        default:
                            System.out.println("\nInvalid option, try it again");

                            break;
                    }
                } else {
                    System.out.println("\nInvalid format, try it again");
                }

                System.out.print("\n");
            } while (option != 6);
        } catch (Exception exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error doing request and managing history" + exception.getMessage());
        }
    }
}
