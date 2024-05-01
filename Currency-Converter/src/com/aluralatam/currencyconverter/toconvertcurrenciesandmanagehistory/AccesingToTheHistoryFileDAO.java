package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface AccesingToTheHistoryFileDAO {
    public List<String> readingHistoryFile(File file) throws IOException;

    public void writeInHistoryFile(File file, String register) throws IOException;

    public List<String> writeSearchedItems(File file, String itemToSearch) throws IOException;

    public void deleteHistoryFile(String historyFileName);

    public void createHistoryFile(String historyFileName) throws IOException;
}
