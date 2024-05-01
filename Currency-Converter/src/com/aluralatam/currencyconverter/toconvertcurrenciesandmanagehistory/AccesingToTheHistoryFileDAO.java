package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface AccesingToTheHistoryFileDAO {
    public List<String> readingHistoryFile(File file) throws IOException;

    public void writeInHistoryFile(File file, String register) throws IOException;
}
