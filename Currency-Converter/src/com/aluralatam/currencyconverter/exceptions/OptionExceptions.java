package com.aluralatam.currencyconverter.exceptions;

public class OptionExceptions {
    public static boolean validateInt (String stringInt) {
        try {
            int intConverter = Integer.parseInt(stringInt);

            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static  boolean validateDouble (String stringDouble) {
        try {
            double doubleConverter = Double.parseDouble(stringDouble);

            return true;
        } catch (Exception execption) {
            return false;
        }
    }
}
