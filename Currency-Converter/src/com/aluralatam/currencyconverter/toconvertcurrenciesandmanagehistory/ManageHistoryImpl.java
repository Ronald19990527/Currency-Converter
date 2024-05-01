package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageHistoryImpl implements ManageHistoryDAO {
    AccesingToTheHistoryFileDAO accesingToTheHistoryFileDAO = new AccesingToTheHistoryFileImpl();

    @Override
    public void viewHistory() throws IOException {
        List<String> historyCurrenciesConverted = new ArrayList<>();

        if (new File(HISTIRY_FILE_NAME).exists()) {
            historyCurrenciesConverted = accesingToTheHistoryFileDAO.readingHistoryFile(new File(HISTIRY_FILE_NAME));

            System.out.print("\n");

            if (historyCurrenciesConverted.size() == 0) {
                System.out.println("No items found in history file");
            }
            else {
                for (String iterator : historyCurrenciesConverted) {
                    System.out.println(iterator);
                }
            }
        }
        else {
            System.out.println("\nThere's not history enabled");
        }
    }

    @Override
    public void searchElementOfTheHistory(String elementToSearch) throws IOException {
        List<String> listItemsToSearched = new ArrayList<>();

        if (new File(HISTIRY_FILE_NAME).exists()) {
            listItemsToSearched = accesingToTheHistoryFileDAO.writeSearchedItems(new File(HISTIRY_FILE_NAME), elementToSearch);

            System.out.print("\n");

            if (listItemsToSearched.size() == 0) {
                System.out.println("There's not items that match with the search");
            }
            else {
                System.out.println("Items that match with the search");
                for (String iterator : listItemsToSearched) {
                    System.out.println(iterator);
                }
            }
        }
        else {
            System.out.println("\nThere's not history enabled");
        }
    }

    @Override
    public void resetHistory() throws IOException {
        if (new File(HISTIRY_FILE_NAME).exists()) {
            accesingToTheHistoryFileDAO.deleteHistoryFile(HISTIRY_FILE_NAME);

            accesingToTheHistoryFileDAO.createHistoryFile(HISTIRY_FILE_NAME);
        }
        else {
            accesingToTheHistoryFileDAO.createHistoryFile(HISTIRY_FILE_NAME);
        }

        System.out.println("\nHistory reset");
    }

    @Override
    public void verifyIfNewHistoryFileExistsAndWrite(String register) throws IOException {
        if (new File(HISTIRY_FILE_NAME).exists()) {
            accesingToTheHistoryFileDAO.writeInHistoryFile(new File(HISTIRY_FILE_NAME), register);
        }
        else {
            PrintWriter printWriter = new PrintWriter(new FileWriter(new File(HISTIRY_FILE_NAME)));
            printWriter.close();

            accesingToTheHistoryFileDAO.writeInHistoryFile(new File(HISTIRY_FILE_NAME), register);
        }
    }
}
