package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;
import com.aluralatam.currencyconverter.exceptions.ExceptionsReading;
import com.aluralatam.currencyconverter.exceptions.ExceptionsWriting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesingToTheHistoryFileImpl implements AccesingToTheHistoryFileDAO {
    @Override
    public List<String> readingHistoryFile(File file) throws ExceptionsReading {
        List<String> historyCurrenciesConverted = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readHistory = null;

            while ((readHistory = bufferedReader.readLine()) != null) {
                historyCurrenciesConverted.add(readHistory);
            }

            bufferedReader.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsReading("Error reading items of the history" + exception.getMessage());
        }

        return historyCurrenciesConverted;
    }

    @Override
    public void writeInHistoryFile(File file, String register) throws ExceptionsWriting {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(register);
            printWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsWriting("Error writing item in the history" + exception.getMessage());
        }
    }

    @Override
    public List<String> writeSearchedItems(File file, String itemToSearch) throws ExceptionsReading {
        List<String> listItemsSearched = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String itemsSearched = null;

            while ((itemsSearched = bufferedReader.readLine()) != null) {
                if (itemsSearched.lastIndexOf(itemToSearch) != -1) {
                    listItemsSearched.add(itemsSearched);
                }
            }

            bufferedReader.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsReading("Error searching item" + exception.getMessage());
        }

        return listItemsSearched;
    }

    @Override
    public void deleteHistoryFile(String historyFileName) {
        File file = new File(historyFileName);

        file.delete();
    }

    @Override
    public void createHistoryFile(String historyFileName) throws ExceptionsManagementHistory {
        try {
            File file = new File(historyFileName);

            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            printWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error creating history file" + exception.getMessage());
        }
    }

    @Override
    public boolean searchItemAndDelete(File currentFile, String itemToDelete) throws ExceptionsManagementHistory {
        boolean itemDeleted = false;

        try {
            String readingLine = null;
            File newCurrentFile = new File(currentFile.getAbsolutePath() + ".tmp");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(currentFile));
            PrintWriter printWriter = new PrintWriter(new FileWriter(newCurrentFile, true));

            while ((readingLine = bufferedReader.readLine()) != null) {
                if (readingLine.trim().lastIndexOf(itemToDelete) == -1) {
                    printWriter.println(readingLine);
                    printWriter.flush();
                }
                else {
                    itemDeleted = true;
                }
            }

            bufferedReader.close();
            printWriter.close();

            currentFile.delete();

            newCurrentFile.renameTo(currentFile);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error searching file" + exception.getMessage());
        } catch (IOException exception ) {
            exception.printStackTrace(System.out);

            throw new ExceptionsManagementHistory("Error searching file" + exception.getMessage());
        }

        return itemDeleted;
    }
}
