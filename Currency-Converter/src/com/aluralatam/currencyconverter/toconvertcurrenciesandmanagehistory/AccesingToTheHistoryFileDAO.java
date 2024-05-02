package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;
import com.aluralatam.currencyconverter.exceptions.ExceptionsReading;
import com.aluralatam.currencyconverter.exceptions.ExceptionsWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface AccesingToTheHistoryFileDAO {
    public List<String> readingHistoryFile(File file) throws IOException, ExceptionsReading;

    public void writeInHistoryFile(File file, String register) throws IOException, ExceptionsWriting;

    public List<String> writeSearchedItems(File file, String itemToSearch) throws IOException, ExceptionsReading;

    public void deleteHistoryFile(String historyFileName);

    public void createHistoryFile(String historyFileName) throws IOException, ExceptionsManagementHistory;

    public boolean searchItemAndDelete(File currentFile, String itemToDelete) throws ExceptionsManagementHistory;
}
