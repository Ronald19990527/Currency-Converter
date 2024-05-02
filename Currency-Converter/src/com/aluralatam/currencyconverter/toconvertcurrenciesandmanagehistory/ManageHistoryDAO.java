package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import com.aluralatam.currencyconverter.exceptions.ExceptionsManagementHistory;

import java.io.File;
import java.io.IOException;

public interface ManageHistoryDAO {
    String HISTIRY_FILE_NAME = "history_file_name.txt";

    public void viewHistory() throws IOException, ExceptionsManagementHistory;

    public void searchElementOfTheHistory(String elementToSearch) throws IOException, ExceptionsManagementHistory;

    public void resetHistory() throws IOException, ExceptionsManagementHistory;

    public void verifyIfNewHistoryFileExistsAndWrite(String register) throws IOException, ExceptionsManagementHistory;

    public void deleteItemOfTheHistory(String itemToDelete) throws ExceptionsManagementHistory;
}
