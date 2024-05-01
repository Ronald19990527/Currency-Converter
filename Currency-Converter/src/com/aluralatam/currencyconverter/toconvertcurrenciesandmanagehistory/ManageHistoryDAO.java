package com.aluralatam.currencyconverter.toconvertcurrenciesandmanagehistory;

import java.io.File;
import java.io.IOException;

public interface ManageHistoryDAO {
    String HISTIRY_FILE_NAME = "history_file_name.txt";

    public void viewHistory() throws IOException;

    public void searchElementOfTheHistory(String elementToSearch);

    public void deleteElementOfTheHistory(String elementToDelete);

    public void resetHistory();

    public void verifyIfNewHistoryFileExistsAndWrite(String register) throws IOException;
}
