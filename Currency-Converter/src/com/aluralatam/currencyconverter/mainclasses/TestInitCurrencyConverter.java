package com.aluralatam.currencyconverter.mainclasses;

import com.aluralatam.currencyconverter.currencies.GroupsCurrencies;
import com.aluralatam.currencyconverter.exceptions.OptionExceptions;

import java.util.Scanner;

public class TestInitCurrencyConverter {
    private static int idMenu = 0;

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

    private static void showMenu(String[] currencies) {
        for (int currenciesIt = 0; currenciesIt <= currencies.length; currenciesIt++) {
            System.out.println(++TestInitCurrencyConverter.idMenu + "."
                    + currencies[currenciesIt]);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String stringOption = "";
        int option = 0;
        String[] GroupCurrencies = new String[20];

        GroupsCurrencies groupsCurrencies = new GroupsCurrencies();

        do {
            System.out.print("\tCurrency Convert\n" +
                    "1 . Convert currency\n" +
                    "2 . View history\n" +
                    "3 . Search element of the history\n" +
                    "4 . Show history\n" +
                    "5 . Delete element of the history\n" +
                    "6 . Reset history\n" +
                    "7 . Exit\n" +
                    "Enter an option : ");
            stringOption = teclado.next();

            if (OptionExceptions.validateInt(stringOption)) {
                option = Integer.parseInt(stringOption);

                switch (option) {
                    case 1:
                        String stringOptionCurrency;
                        System.out.println("\n\tEnter the option for the currency " +
                                "you are going to convert (Enter 0 to exit)");
                        showMenu(groupsCurrencies.returnFirstGroupCurrencies());
                        showMenu(groupsCurrencies.returnSecondGroupCurrencies());
                        showMenu(groupsCurrencies.returnThirdGroupCurrencies());
                        showMenu(groupsCurrencies.returnFourthGroupCurrencies());
                        showMenu(groupsCurrencies.returnFifthGroupCurrencies());
                        showMenu(groupsCurrencies.returnSixthGroupCurrencies());
                        showMenu(groupsCurrencies.returnSeventhGroupCurrencies());
                        showMenu(groupsCurrencies.returnEighthGroupCurrencies());

                        do {
                            System.out.print("Enter an option : ");
                            stringOptionCurrency = teclado.next();
                        } while (!verifyInteger(stringOptionCurrency));

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("\nInvalid format, try it again");
            }

            System.out.print("\n");
        } while (option != 7);
    }
}
