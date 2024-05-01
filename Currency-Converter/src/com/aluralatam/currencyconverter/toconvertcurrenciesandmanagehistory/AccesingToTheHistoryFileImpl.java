package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesingToTheHistoryFileImpl implements AccesingToTheHistoryFileDAO {
    @Override
    public List<String> readingHistoryFile(File file) throws IOException {
        List<String> historyCurrenciesConverted = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readHistory = bufferedReader.readLine();

        while (readHistory != null) {
            historyCurrenciesConverted.add(readHistory);

            readHistory = bufferedReader.readLine();
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
}
