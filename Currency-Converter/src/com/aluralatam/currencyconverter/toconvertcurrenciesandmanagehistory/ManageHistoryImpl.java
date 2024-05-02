package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageHistoryImpl implements ManageHistoryDAO {
    AccesingToTheHistoryFileDAO accesingToTheHistoryFileDAO = new AccesingToTheHistoryFileImpl();

    @Override
    public void viewHistory() throws ExceptionsManagementHistory {
        try {
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
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error reading history" + exception.getMessage());
        }
    }

    @Override
    public void searchElementOfTheHistory(String elementToSearch) throws ExceptionsManagementHistory {
        try {
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
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error searching item in the history" + exception.getMessage());
        }
    }

    @Override
    public void resetHistory() throws ExceptionsManagementHistory {
        try {
            if (new File(HISTIRY_FILE_NAME).exists()) {
                accesingToTheHistoryFileDAO.deleteHistoryFile(HISTIRY_FILE_NAME);

                accesingToTheHistoryFileDAO.createHistoryFile(HISTIRY_FILE_NAME);
            }
            else {
                accesingToTheHistoryFileDAO.createHistoryFile(HISTIRY_FILE_NAME);
            }

            System.out.println("\nHistory reset");
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error to reset the history" + exception.getMessage());
        }
    }

    @Override
    public void verifyIfNewHistoryFileExistsAndWrite(String register) throws ExceptionsManagementHistory {
        try {
            if (new File(HISTIRY_FILE_NAME).exists()) {
                accesingToTheHistoryFileDAO.writeInHistoryFile(new File(HISTIRY_FILE_NAME), register);
            }
            else {
                PrintWriter printWriter = new PrintWriter(new FileWriter(new File(HISTIRY_FILE_NAME)));
                printWriter.close();

                accesingToTheHistoryFileDAO.writeInHistoryFile(new File(HISTIRY_FILE_NAME), register);
            }
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error to write in the history file" + exception.getMessage());
        }
    }

    @Override
    public void deleteItemOfTheHistory(String itemToDelete) throws ExceptionsManagementHistory {
        try {
            if (new File(HISTIRY_FILE_NAME).exists()) {
                if (accesingToTheHistoryFileDAO.searchItemAndDelete(new File(HISTIRY_FILE_NAME), itemToDelete)) {
                    System.out.println("Item deleted successfully");
                }
                else {
                    System.out.println("No element found");
                }
            }
            else {
                System.out.println("We're sorry, but there's not history available");
            }
        } catch (ExceptionsManagementHistory exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error to delete item" + exception.getMessage());
        }
    }
}
