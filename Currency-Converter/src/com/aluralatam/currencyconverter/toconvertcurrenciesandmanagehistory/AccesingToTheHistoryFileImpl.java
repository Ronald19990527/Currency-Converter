package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesingToTheHistoryFileImpl implements AccesingToTheHistoryFileDAO {
    @Override
    public List<String> readingHistoryFile(File file) throws IOException {
        List<String> historyCurrenciesConverted = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readHistory = null;

        while ((readHistory = bufferedReader.readLine()) != null) {
            historyCurrenciesConverted.add(readHistory);
        }

        bufferedReader.close();

        return historyCurrenciesConverted;
    }

    @Override
    public void writeInHistoryFile(File file, String register) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.println(register);
        printWriter.close();
    }

    @Override
    public List<String> writeSearchedItems(File file, String itemToSearch) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String itemsSearched = null;
        List<String> listItemsSearched = new ArrayList<>();

        while ((itemsSearched = bufferedReader.readLine()) != null) {
            if (itemsSearched.lastIndexOf(itemToSearch) != -1) {
                listItemsSearched.add(itemsSearched);
            }
        }

        bufferedReader.close();

        return listItemsSearched;
    }

    @Override
    public void deleteHistoryFile(String historyFileName) {
        File file = new File(historyFileName);

        file.delete();
    }

    @Override
    public void createHistoryFile(String historyFileName) throws IOException {
        File file = new File(historyFileName);

        PrintWriter printWriter = new PrintWriter(new FileWriter(file));
        printWriter.close();
    }
}
