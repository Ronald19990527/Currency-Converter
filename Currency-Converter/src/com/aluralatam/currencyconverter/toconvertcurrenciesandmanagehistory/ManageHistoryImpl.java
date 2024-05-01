package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.*;
import java.util.List;

public class ManageHistoryImpl implements ManageHistoryDAO {
    AccesingToTheHistoryFileDAO accesingToTheHistoryFileDAO = new AccesingToTheHistoryFileImpl();

    @Override
    public void viewHistory() throws IOException {
        AccesingToTheHistoryFileDAO accesingToTheHistoryFileDAO = new AccesingToTheHistoryFileImpl();

        if (new File(HISTIRY_FILE_NAME).exists()) {
            List<String> historyCurrenciesConverted = accesingToTheHistoryFileDAO.readingHistoryFile(new File(HISTIRY_FILE_NAME));

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
    public void searchElementOfTheHistory(String elementToSearch) {

    }

    @Override
    public void deleteElementOfTheHistory(String elementToDelete) {

    }

    @Override
    public void resetHistory() {

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
