package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileManager {

    private static final String myriadFileName = "transactions.csv";

    // Save transaction to CSV
    public static void saveTransaction(Transaction transaction) {
        try {
            BufferedWriter cWriter = new BufferedWriter(new FileWriter(myriadFileName, true));
            cWriter.write(transaction.toString());
            cWriter.newLine();

            cWriter.close();

        } catch (Exception e) {
            System.out.println("Error saving transaction");
        }
    }
    //Load transactions from csv
    public static ArrayList<Transaction> getTransactions() {

    ArrayList<Transaction> transactions = new ArrayList<>();


    try {
        BufferedReader cReader = new BufferedReader(new FileReader(myriadFileName));
        String cLine;

        while ((cLine = cReader.readLine()) != null) {
            String[] cParts = cLine.split("\\|");
            Transaction transaction = new Transaction(
                    cParts[0],
                    cParts[1],
                    cParts[2],
                    cParts[3],
                    Double.parseDouble(cParts[4]));


            transactions.add(transaction);
        }
        cReader.close();
    }  catch (Exception e) {
        System.out.println("Error reading transaction file.");



    }

    return  transactions;
    }
}
